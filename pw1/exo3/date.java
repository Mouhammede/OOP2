import java.time.LocalDate;
public class date {
    public int day;
    public int month;
    public int year;
    public date()
    {
        LocalDate l=LocalDate.now();
        day=l.getDayOfMonth();
        month=l.getMonthValue();
        year=l.getYear();
    }
    public date(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public void setdate(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public String getdate()
    {
        return day+"\\"+month+"\\"+year;
    }
}