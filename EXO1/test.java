public class test {
    public static void main(String[] args) {
        document[] a=new document[3];
        a[0]=new book("vvv",3,"18/12/2015","KKK",30);
        a[1]=new magazine("BBB",3,"17/05/2012","eee",123,20);
        a[2]=new DVD("ddd",3,"17/11/2014","jjj",12);
        subscriber[] s=new subscriber[3];
        subscriber y=new subscriber(3456);
        s[0]=new subscriber(12345);
        s[1]=new subscriber(67890);
        s[2]=new subscriber(13578);
        librery l=new librery(a,s);
        l.sub.get(0).borow(a[0],l.doc);
        if(s[0].doc!=null)
        {
            System.out.println("ttttttttt");
        }
        l.sub.get(1).borow(a[0],l.doc);
        l.sub.get(2).borow(a[0],l.doc);
        l.addsub(y);
        l.sub.get(3).borow(a[0],l.doc);
        if(!a[0].av)
        {
            System.out.println("ttttttttt");
        }
        else
        {
            System.out.println("eeeeeeeeee");
        }
    }
}
