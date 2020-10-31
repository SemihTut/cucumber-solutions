package VismaSolutions.POJO.WorkHours;

public class Phase {
    private String isLocked;

    private String name;

    private String guid;

    private String isCompleted;

    public String getIsLocked ()
    {
        return isLocked;
    }

    public void setIsLocked (String isLocked)
    {
        this.isLocked = isLocked;
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

    public String getIsCompleted ()
    {
        return isCompleted;
    }

    public void setIsCompleted (String isCompleted)
    {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isLocked = "+isLocked+", name = "+name+", guid = "+guid+", isCompleted = "+isCompleted+"]";
    }
}
