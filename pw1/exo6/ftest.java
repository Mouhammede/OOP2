public class ftest {
    public static void main(String[] args)
    {
        RW f=new RW("dr");
        RW t;
        for(int i=0;i<f.getdirectoryfilesfile().length;i++)
        {
            System.out.print(i);
            t=new RW("dr\\"+f.getdirectoryfilesfile()[i].getName());
            System.out.println(f.getdirectoryfilesfile()[i].getName()+"\t"+f.getdirectoryfilesfile()[i].toPath());
            System.out.println("********************");
            //t.printcontant();
            System.out.println(t.getcontant());
            System.out.println("********************");
        }
    }
}
