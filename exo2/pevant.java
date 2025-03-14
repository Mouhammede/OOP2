public class pevant extends evant
{
    public tickt[] t;
    public int tn;//tickt number
    public int tns;//tickt number soled
    public class tickt 
    {
        public boolean used;
        public String name;
        public tickt(String n)
        {
            this.used=false;
            this.name=n;
        }
        public void use()
        {
            if(!used)
            {
                this.used=true;
            }
        }
    }
    public int prace;
    public pevant(String n,int a,int t,int p)
    {
        super(n,a);
        this.t=new tickt[t];
        this.tn=t;
        this.tns=0;
        this.prace=p;
    }
    public int gane()
    {
        return tns*prace;
    }
    public void sale(String n)
    {
        if(tn>tns)
        {
            t[tns]=new tickt(n);
            tns++;
            super.resorve_a_seats(1);
        }
    }
    private int serch(String n)
    {
        int i;
        for(i=0;i<tns;i++)
        {
            if(t[i].name==n)
            {
                return i;
            }
        }
        return -1;
    }
    public void welcome(String n)
    {
        int k=serch(n);
        if(k!=-1)
        {
            t[k].use();
        }
        else
        {
            System.out.println("your tickte is fake");
        }
    }
}