public class evant 
{
    public String name;
    public int sn;//seats number
    public int sr;//seats resorved
    public evant(String n,int a)
    {
        this.name=n;
        this.sn=a;
        this.sr=0;
    }
    public int seats_left()
    {
        return this.sn-this.sr;
    }
    public void resorve_a_seats(int n)//n = how many seats you won
    {
        if(n<=this.seats_left())
        {
            this.sr=this.sr+n;
        }
        //else
        //{
        //    System.out.println("there is only "+this.seats_left()+" left");
        //}
    }
    public void delete_a_seat(int n)
    {
        if(sn-n>=0)
        {
            sn=sn-n;
        }
    }
    @Override
    public String toString()
    {
        return name+" there is "+sn+" seats "+sr+" are taken";
    }
}