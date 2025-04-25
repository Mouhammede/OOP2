import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class aaa
{
    private File f;
    public aaa(String t)
    {
        f=new File(t);
    }
    public void sss(String d)
    {
        BufferedReader r;
        boolean k=true;
        try {
            r=new BufferedReader(new FileReader(f));
            int i=0;
            String s;
            for(i=0;(s=r.readLine())!=null;i++)
            {
                if(s.toLowerCase().contains(d.toLowerCase()))
                {
                    System.out.println((i+1)+" - "+s);
                    k=false;
                }
            }
            if(k)
            {
                System.out.println("the word das not exist");
            }
        } catch (IOException e) {
            System.out.println("lalalalalalalala");
        }
    }
}
