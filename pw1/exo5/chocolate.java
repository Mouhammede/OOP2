public class chocolate extends condiment
{
    public chocolate(coffee x)
    {
        c=x;
        setdescription(c.getdescription()+" chocolate");
    }
    public double cost()
    {
        return c.cost()+10;
    }
}
