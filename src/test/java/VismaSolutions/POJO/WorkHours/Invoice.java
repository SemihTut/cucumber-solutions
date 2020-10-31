package VismaSolutions.POJO.WorkHours;

public class Invoice {
    private String date;

    private String number;

    private String guid;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getGuid ()
    {
        return guid;
    }

    public void setGuid (String guid)
    {
        this.guid = guid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", number = "+number+", guid = "+guid+"]";
    }
}
