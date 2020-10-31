package VismaSolutions.POJO.WorkHours;

public class Project {
    private String internalName;

    private String number;

    private String isClosed;

    private String name;

    private String guid;

    private String companyGuid;

    public String getInternalName ()
    {
        return internalName;
    }

    public void setInternalName (String internalName)
    {
        this.internalName = internalName;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getIsClosed ()
    {
        return isClosed;
    }

    public void setIsClosed (String isClosed)
    {
        this.isClosed = isClosed;
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

    public String getCompanyGuid ()
    {
        return companyGuid;
    }

    public void setCompanyGuid (String companyGuid)
    {
        this.companyGuid = companyGuid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [internalName = "+internalName+", number = "+number+", isClosed = "+isClosed+", name = "+name+", guid = "+guid+", companyGuid = "+companyGuid+"]";
    }
}
