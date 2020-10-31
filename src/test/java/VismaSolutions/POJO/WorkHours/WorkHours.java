package VismaSolutions.POJO.WorkHours;

public class WorkHours {
    private String invoiceRowGuid;

    private Project project;

    private String description;

    private String createdDateTime;

    private String invoiceRowDescription;

    private String isModifiable;

    private String relationToUser;

    private String startTime;

    private String isApproved;

    private Phase phase;

    private UnitPrice unitPrice;

    private LastUpdatedBy lastUpdatedBy;

    private int quantity;

    private String billableStatus;

    private String isBillable;

    private String isProductive;

    private String invoiceQuantity;

    private CreatedBy createdBy;

    private UnitCost unitCost;

    private String activityGuid;

    private WorkType workType;

    private String guid;

    private Overtime overtime;

    private Invoice invoice;

    private String endTime;

    private String lastUpdatedDateTime;

    private String invoiceRowComment;

    private User user;

    private Customer customer;

    private String eventDate;


    public WorkHours(Phase phase, int quantity, WorkType workType, String eventDate) {
        this.phase = phase;
        this.quantity = quantity;
        this.workType = workType;
        this.eventDate = eventDate;
    }

    public String getInvoiceRowGuid ()
    {
        return invoiceRowGuid;
    }

    public void setInvoiceRowGuid (String invoiceRowGuid)
    {
        this.invoiceRowGuid = invoiceRowGuid;
    }

    public Project getProject ()
    {
        return project;
    }

    public void setProject (Project project)
    {
        this.project = project;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getCreatedDateTime ()
    {
        return createdDateTime;
    }

    public void setCreatedDateTime (String createdDateTime)
    {
        this.createdDateTime = createdDateTime;
    }

    public String getInvoiceRowDescription ()
    {
        return invoiceRowDescription;
    }

    public void setInvoiceRowDescription (String invoiceRowDescription)
    {
        this.invoiceRowDescription = invoiceRowDescription;
    }

    public String getIsModifiable ()
    {
        return isModifiable;
    }

    public void setIsModifiable (String isModifiable)
    {
        this.isModifiable = isModifiable;
    }

    public String getRelationToUser ()
    {
        return relationToUser;
    }

    public void setRelationToUser (String relationToUser)
    {
        this.relationToUser = relationToUser;
    }

    public String getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (String startTime)
    {
        this.startTime = startTime;
    }

    public String getIsApproved ()
    {
        return isApproved;
    }

    public void setIsApproved (String isApproved)
    {
        this.isApproved = isApproved;
    }

    public Phase getPhase ()
    {
        return phase;
    }

    public void setPhase (Phase phase)
    {
        this.phase = phase;
    }

    public UnitPrice getUnitPrice ()
    {
        return unitPrice;
    }

    public void setUnitPrice (UnitPrice unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public LastUpdatedBy getLastUpdatedBy ()
    {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy (LastUpdatedBy lastUpdatedBy)
    {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public int getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }

    public String getBillableStatus ()
    {
        return billableStatus;
    }

    public void setBillableStatus (String billableStatus)
    {
        this.billableStatus = billableStatus;
    }

    public String getIsBillable ()
    {
        return isBillable;
    }

    public void setIsBillable (String isBillable)
    {
        this.isBillable = isBillable;
    }

    public String getIsProductive ()
    {
        return isProductive;
    }

    public void setIsProductive (String isProductive)
    {
        this.isProductive = isProductive;
    }

    public String getInvoiceQuantity ()
    {
        return invoiceQuantity;
    }

    public void setInvoiceQuantity (String invoiceQuantity)
    {
        this.invoiceQuantity = invoiceQuantity;
    }

    public CreatedBy getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (CreatedBy createdBy)
    {
        this.createdBy = createdBy;
    }

    public UnitCost getUnitCost ()
    {
        return unitCost;
    }

    public void setUnitCost (UnitCost unitCost)
    {
        this.unitCost = unitCost;
    }

    public String getActivityGuid ()
    {
        return activityGuid;
    }

    public void setActivityGuid (String activityGuid)
    {
        this.activityGuid = activityGuid;
    }

    public WorkType getWorkType ()
    {
        return workType;
    }

    public void setWorkType (WorkType workType)
    {
        this.workType = workType;
    }

    public String getGuid ()
    {
        return guid;
    }

    public void setGuid (String guid)
    {
        this.guid = guid;
    }

    public Overtime getOvertime ()
    {
        return overtime;
    }

    public void setOvertime (Overtime overtime)
    {
        this.overtime = overtime;
    }

    public Invoice getInvoice ()
    {
        return invoice;
    }

    public void setInvoice (Invoice invoice)
    {
        this.invoice = invoice;
    }

    public String getEndTime ()
    {
        return endTime;
    }

    public void setEndTime (String endTime)
    {
        this.endTime = endTime;
    }

    public String getLastUpdatedDateTime ()
    {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime (String lastUpdatedDateTime)
    {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public String getInvoiceRowComment ()
    {
        return invoiceRowComment;
    }

    public void setInvoiceRowComment (String invoiceRowComment)
    {
        this.invoiceRowComment = invoiceRowComment;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public Customer getCustomer ()
    {
        return customer;
    }

    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }

    public String getEventDate ()
    {
        return eventDate;
    }

    public void setEventDate (String eventDate)
    {
        this.eventDate = eventDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [invoiceRowGuid = "+invoiceRowGuid+", project = "+project+", description = "+description+", createdDateTime = "+createdDateTime+", invoiceRowDescription = "+invoiceRowDescription+", isModifiable = "+isModifiable+", relationToUser = "+relationToUser+", startTime = "+startTime+", isApproved = "+isApproved+", phase = "+phase+", unitPrice = "+unitPrice+", lastUpdatedBy = "+lastUpdatedBy+", quantity = "+quantity+", billableStatus = "+billableStatus+", isBillable = "+isBillable+", isProductive = "+isProductive+", invoiceQuantity = "+invoiceQuantity+", createdBy = "+createdBy+", unitCost = "+unitCost+", activityGuid = "+activityGuid+", workType = "+workType+", guid = "+guid+", overtime = "+overtime+", invoice = "+invoice+", endTime = "+endTime+", lastUpdatedDateTime = "+lastUpdatedDateTime+", invoiceRowComment = "+invoiceRowComment+", user = "+user+", customer = "+customer+", eventDate = "+eventDate+"]";
    }
}
