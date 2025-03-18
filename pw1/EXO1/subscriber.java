public class subscriber 
{
    public int ID;
    public document doc;
    public subscriber(int n)
    {
        this.ID=n;
        this.doc=null;
    }
    public subscriber(int n,document d)
    {
        this.ID=n;
        this.doc=d;
    }
    public int serch(String n,document[] d)
    {
        int i;
        for(i=0;i<d.length;i++)
        {
            if(d[i].name==n)
            {
                return i;
            }
        }
        return -1;
    }
    public void borow(document d,document[] u)
    {
        if(serch(d.name,u)!=-1&&this.doc==null)
        {
            d.borow();
            this.doc=d;
        }
    }
    public void returning(document d,document[] u)
    {
        
        if(serch(d.name,u)!=-1&&this.doc!=null)
        {
            d.returning();
            this.doc=null;
        }
    }
}
