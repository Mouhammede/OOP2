public class document {
    public String name;
    public int copys;
    public int cb;//copys borewed
    public boolean av;//avilebole
    public String pd;//publication date
    public String author;
    public document(String n,int a,String d,String w)
    {
        this.name=n;
        this.copys=a;
        this.pd=d;
        this.author=w;
        this.cb=0;
        if(this.copys>this.cb)
        {
            this.av=true;
        }
        else
        {
            this.av=false;
        }
    }
    private void tav()
    {
        if(this.copys>this.cb)
        {
            this.av=true;
        }
        else
        {
            this.av=false;
        }
    }
    public void addcopy(int n)
    {
        this.copys=this.copys+n;
        //tav();
    }
    public void removecopy(int n)
    {
        this.copys=this.copys-n;
        tav();
    }
    public void borow()
    {
        if(this.copys>0)
        {
            this.copys--;
            this.cb++;
            tav();
        }
    }
    public void returning()
    {
        if(this.cb>0)
        {
            this.copys++;
            this.cb--;
            //tav();
        }
    }
}