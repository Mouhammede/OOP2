public class teast 
{
    public static void main(String[] args) 
    {
        coffee c=new decaf();
        c=new chocolate(c);
        c=new milk(c);
        System.out.println("you oredred : "+c.getdescription());
        System.out.println("total price : "+c.cost());
    }
}
