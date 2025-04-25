import java.io.*;
public class teast {
    public static void main(String[] args)
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        String o="m";
        boolean k;
        while (o!="d") {
            try
            {
                System.out.print("enter a number 1 : ");
                a=Integer.parseInt(r.readLine());
                while (o!="*"&&o!="+"&&o!="-"&&o!="/"&&o!="d")
                {
                    System.out.print("enter an operator : ");
                    o=r.readLine();
                    System.out.println(o+"\t"+o.length()+"\t"+"+".length());
                    k=o!="*"&&o!="+"&&o!="-"&&o!="/"&&o!="d";
                    System.out.println(k);
                }
                if(o=="d")
                {
                    break;
                }
                System.out.print("enter a number 2 : ");
                b=Integer.parseInt(r.readLine());
                if(o=="+")
                {
                    System.out.println("the resolt is : "+calculator.add(a,b));
                }
                else if(o=="-")
                {
                    System.out.println("the resolt is : "+calculator.subtraction(a,b));
                }
                else if(o=="*")
                {
                    System.out.println("the resolt is : "+calculator.multiplication(a,b));
                }
                else if(o=="/")
                {
                    System.out.println("the resolt is : "+calculator.division(a,b));
                }
                o="m";
            } 
            catch (IOException |NumberFormatException e)
            {
                System.err.println("error");
            }
        }
    }
}
