import java.util.ArrayList;
public class bank 
{
    public String name;
    public String locashon;
    private ArrayList<account> accounts=new ArrayList<>();
    public class account
    {
        private int ID;
        private int password;
        private double balence;
        private ArrayList<history> his;
        private double loan;
        public double tax;
        public account(int i,int pass,double bal)
        {
            ID=i;
            password=pass;
            balence=bal;
            his=new ArrayList<>();
            loan=0;
            tax=20;
        }
        private void printhistory()
        {
            int i;
            for(i=0;i<his.size();i++)
            {
                System.out.println(his.get(i).printinfo());
            }
        }
        private boolean checkownership(int i,int pass)
        {
            if(ID==i&&password==pass)
            {
                return true;
            }
            return false;
        }
        private void deposit(double n)
        {
            date t=new date();
            his.add(new history(t,"deposit",ID,n,0));
            balence=balence+n-tax;
        }
        private void withdraw(double n)
        {
            date t=new date();
            if(n<=balence)
            {
                balence=balence-n-tax;
                his.add(new history(t,"Withdraw",ID,n,0));
            }
            else
            {
                System.out.println("you do not have "+n+" DA");
                System.out.println("you have "+balence+" DA");
            }
        }
        private void takeloan(double n)
        {
            if(loan==0)
            {
                loan=n;
                date t=new date();
                his.add(new history(t,"Take a loan",ID,n,0));
            }
        }
        private void paytheloan(double n)
        {
            if(loan!=0)
            {
                date t=new date();
                loan=loan-n;
                if(loan<0)
                {
                    loan=loan*(-1);
                    balence=balence+loan;
                    his.add(new history(t,"pay the loan",ID,n-loan,0));
                    his.add(new history(t,"Deposit",ID,loan,0));
                    loan=0;
                }
                else
                {
                    his.add(new history(t,"pay the loan",ID,n-loan,0));
                }
            }
        }
        private boolean checkexestence(int i)
        {
            if(ID==i)
            {
                return true;
            }
            return false;
        }
        private boolean tranto(double n,int ri)
        {
            date t=new date();
            if(balence>=n)
            {
                balence=balence-n;
            }
            else
            {
                System.out.println("you do not have "+n+" DA");
                System.out.println("you have "+balence+" DA");
                return false;
            }
            his.add(new history(t,"transfered from",ID,n,ri));
            return true;            
        }
        private void tranben(double n,int ri)
        {
            date t=new date();
            balence=balence+n;
            his.add(new history(t,"transfer receved",ID,n,ri));
        }
    }
    private int getindex(int id,int pass)
    {
        int i;
        for(i=0;i<accounts.size();i++)
        {
            if(accounts.get(i).checkownership(id,pass))
            {
                return i;
            }
        }
        return -1;
    }
    public void dipos(double n,int id,int pass)
    {
        int y;
        y=getindex(id,pass);
        if(y!=-1)
        {
            accounts.get(y).deposit(n);
        }
        else
        {
            System.out.println("ID or password incoracte");
        }
    }
    public void withd(double n,int id,int pass)
    {
        int y;
        y=getindex(id,pass);
        if(y!=-1)
        {
            accounts.get(y).withdraw(n);
        }
        else
        {
            System.out.println("ID or password incoracte");
        }
    }
    public void tloan(double n,int id,int pass)
    {
        int y;
        y=getindex(id,pass);
        if(y!=-1)
        {
            accounts.get(y).takeloan(n);
        }
        else
        {
            System.out.println("ID or password incoracte");
        }
    }
    public void ploan(double n,int id,int pass)
    {
        int y;
        y=getindex(id,pass);
        if(y!=-1)
        {
            accounts.get(y).paytheloan(n);
        }
        else
        {
            System.out.println("ID or password incoracte");
        }
    }
    private int getindexbyID(int t)
    {
        int i;
        for(i=0;i<accounts.size();i++)
        {
            if(accounts.get(i).checkexestence(i))
            {
                return i;
            }
        }
        return -1;
    }
    public void tran(double n,int id,int pass,int rid)
    {
        int x,y;
        x=getindexbyID(rid);
        y=getindex(id,pass);
        if(y!=-1&&x!=-1)
        {
            if(accounts.get(y).tranto(n,rid))
            {
                accounts.get(x).tranben(n,id);
            }
        }
    }
    private static bank b=null;
    private bank(String n,String l)
    {
        name=n;
        locashon=l;
    }
    public bank openbank(String n,String l)
    {
        if(b==null)
        {
            b=new bank(n,l);
        }
        return b;
    }
    public void addaccount(int i,int pass,double bal)
    {
        accounts.add(new account(i,pass,bal));
    }
    public void deleteaccount(int i,int pass)
    {
        int y;
        y=getindex(i,pass);
        if(y!=-1)
        {
            accounts.remove(y);
        }
    }
    public void printhistoryofaccount(int i,int pass)
    {
        int y;
        y=getindex(i,pass);
        if(y!=-1)
        {
            accounts.get(y).printhistory();
        }
    }
}