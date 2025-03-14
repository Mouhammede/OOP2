public class milk extends condiment
{
    public milk(coffee x)
    {
        c=x;
        setdescription(c.getdescription()+" milk");
    }
    public double cost()
    {
        return c.cost()+10;
    }
}
