public class book extends document
{
    public int pn;//page number
    public book(String n,int a,String d,String w,int p)
    {
        super(n,a,d,w);
        this.pn=p;
    }
}