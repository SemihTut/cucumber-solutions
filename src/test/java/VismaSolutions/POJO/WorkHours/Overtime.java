package VismaSolutions.POJO.WorkHours;

public class Overtime {
    private String name;

    private String guid;

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
        return "ClassPojo [name = "+name+", guid = "+guid+"]";
    }
}
