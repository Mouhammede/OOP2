import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RW {

    private File f;
    public RW(String n)
    {
        f=new File(n);
    }
    public File getFile()
    {
        return f;
    }
    public String[] getdirectoryfilesstring()
    {
        if(f.isDirectory())
        {
            String[] s=f.list();
            return s;
        }
        System.out.println("that is not a Directory");
        return null;
    }
    public File[] getdirectoryfilesfile()
    {
        if(f.isDirectory())
        {
            File[] l=f.listFiles();
            return l;
        }
        System.out.println("that is not a Directory");
        return null;
    }
    public void printcontant()
    {
        if((!f.isDirectory())&&f.exists())
        {
            BufferedReader r;
            try
            {
                r=new BufferedReader(new FileReader(f));
                String s;
                while ((s=r.readLine())!=null)
                {
                    System.out.println(s);
                }
            } catch (IOException e) 
            {
                System.err.println("error");
            }
        }
    }
    public String getcontant()
    {
        if((!f.isDirectory())&&f.exists())
        {
            BufferedReader r;
            String s,w="";
            try
            {
                r=new BufferedReader(new FileReader(f));
                while ((s=r.readLine())!=null)
                {
                    
                    w=w+s+"\n";
                }
                StringBuilder t;
                t=new StringBuilder(w);
                t.setCharAt(w.length()-1,' ');
                w=t.toString();
            } catch (IOException e) 
            {
                System.err.println("error");
            }
            return w;
        }
        return null;
    }
    public boolean write(String s)
    {
        if((!f.isDirectory())&&f.exists())
        {
            FileWriter w;
            try
            {
                w=new FileWriter(f);
                w.write(s);
                w.close();
            } catch (IOException e)
            {
                System.err.println("error");
            }
            return true;
        }
        return false;
    }
    public boolean cwrite(String s)
    {
        if((!f.isDirectory()))
        {
            FileWriter w;
            try
            {
                w=new FileWriter(f,true);
                w.write(s);
                w.close();
            } catch (IOException e)
            {
                System.err.println("error");
            }
            return true;
        }
        return false;
    }
}