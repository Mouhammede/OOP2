import java.util.Scanner;
public class teast {
    public static void main(String[] args) throws psswordexeptoin {
        System.out.print("enter password : ");
        String p;
        Scanner s=new Scanner(System.in);
        p=s.nextLine();
        if(p.length()<8)
        {
            throw new psswordexeptoin();
        }
        else
        {
            boolean l=false,u=false,d=false;
            for (int i=0;i<p.length();i++)
            {
                if(p.charAt(i)>='a'&&p.charAt(i)<='z')
                {
                    l=true;
                }
                else if(p.charAt(i)>='0'&&p.charAt(i)<='9')
                {
                    d=true;
                }
                else if(p.charAt(i)>='A'&&p.charAt(i)<='Z')
                {
                    u=true;
                }
            }
            System.out.println(u+"\t"+l+"\t"+d);
            if(u && l && d)
            {
                System.out.println("passwoed is valide");
            }
            else
            {
                throw new psswordexeptoin();
            }
        }
    }
}
