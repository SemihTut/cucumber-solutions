package VismaSolutions.POJO.WorkHours;

public class CreatedBy {
    private String firstName;

    private String lastName;

    private String code;

    private String name;

    private String guid;

    private String photoFileGuid;

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
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

    public String getPhotoFileGuid ()
    {
        return photoFileGuid;
    }

    public void setPhotoFileGuid (String photoFileGuid)
    {
        this.photoFileGuid = photoFileGuid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [firstName = "+firstName+", lastName = "+lastName+", code = "+code+", name = "+name+", guid = "+guid+", photoFileGuid = "+photoFileGuid+"]";
    }
}
