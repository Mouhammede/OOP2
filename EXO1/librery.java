import java.util.ArrayList;

public class librery {
    public document[] doc=new document[100];
    //public subscriber[] sub=new subscriber[100];
    ArrayList<subscriber> sub=new ArrayList<subscriber>();
    //private int sn=0;//subscribers number
    public librery(document[] k,subscriber[] s)
    {
        this.doc=k;
        //this.sub=s;
        for(int i=0;i<s.length;i++)
        {
            sub.add(s[i]);
            //sn++;
        }
        //sn=s.length;
        //this.sn=0;
    }
    public librery(document[] k)
    {
        this.doc=k;
        //this.sn=0;
    }
    public boolean serch(String n)
    {
        int i;
        for(i=0;i<doc.length;i++)
        {
            if(doc[i].name==n)
            {
                return true;
            }
        }
        return false;
    }
    private int serchs(int id)
    {
        int i;
        for(i=0;i<sub.size();i++)
        {
            if(sub.get(i).ID==id)
            {
                return i;
            }
        }
        return -1;
    }
    public void addsub(subscriber s)
    {
        System.out.println(serchs(s.ID));
        if(serchs(s.ID)==-1)
        {
            //this.sub[sn]=s;
            sub.add(s);
            //sn++;
        }
    }
    public void deletesub(subscriber s)
    {
        if(serchs(s.ID)!=-1)
        {
            //int i;
           // for(i=serchs(s.ID);i<sn-1;i++)
           // {
           //     doc[i]=doc[i+1];
           // }
           // sn--;
            sub.remove(s);
        }
    }
}
