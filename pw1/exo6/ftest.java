import java.io.*;
public class ftest {
    public static void main(String[] args)
    {
        FileWriter w;
        try {
            w=new FileWriter(new File("dr\\ex4.txt"));
            w.write("kkk\n");
            w.close();
        } catch (IOException e) {
            System.out.println("error");
        }
        File f=new File("dr");
        String[] fl=f.list();
        BufferedReader r;
        for(int i=0;i<fl.length;i++)
        {
            System.out.println(fl[i]);
            System.out.println("*****************");
            String s="dr\\"+fl[i];
            if(i==0)
            {
                try {
                    r=new BufferedReader(new FileReader(new File(s)));
                    f=tup.tran(new File(s));
                    String l;
                    while ((l=r.readLine())!=null) {
                        System.out.println(l);
                    }
                } catch (IOException e) {
                    
                }
            }
        }
    }
}
