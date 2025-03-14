public class cream extends condiment
{
    public cream(coffee x)
    {
        c=x;
        setdescription(c.getdescription()+" cream");
    }
    public double cost()
    {
        return c.cost()+10;
    }
}
