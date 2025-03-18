public class magazine extends document
{
    public int number;
    public int pn;
    public magazine(String n,int a,String d,String w,int vn,int p)
    {
        super(n,a,d,w);
        this.number=vn;
        this.pn=p;
    }
}
