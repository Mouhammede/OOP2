import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tup {
    public static File tran(File f)
    {
        BufferedReader r;
        FileWriter w;
        try {
            r=new BufferedReader(new FileReader(f));
            w=new FileWriter(f);
            String t="";
            int c;
            while ((c=r.read()) != -1) 
            { 
                if(c>='a'&&c!='\n')
                {
                    t=t+(char)(c-41);
                }
                else
                {
                    t=t+c;
                }
                //System.out.println(line);
            }
            r.close();
            w.write(t);
            w.close();
        } catch (IOException e) {
            System.out.println("error");
        }
        return f;
    }
}
