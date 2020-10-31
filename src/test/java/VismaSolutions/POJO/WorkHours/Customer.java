package VismaSolutions.POJO.WorkHours;

public class Customer {
    private String number;

    private String name;

    private String guid;

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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
        return "ClassPojo [number = "+number+", name = "+name+", guid = "+guid+"]";
    }
}
