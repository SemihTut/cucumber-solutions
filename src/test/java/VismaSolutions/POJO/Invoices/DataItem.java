package VismaSolutions.POJO.Invoices;

import java.util.List;

public class DataItem{
	private String date;
	private double totalIncludingTax;
	private double overdueInterest;
	private SenderAddress senderAddress;
	private List<ProjectsItem> projects;
	private BusinessUnit businessUnit;
	private String orderNumber;
	private Notes notes;
	private double totalIncludingTaxInCompanyCurrency;
	private String dueDate;
	private double totalExcludingTaxInBaseCurrency;
	private double workHourValueAddedTax;
	private String createdDateTime;
	private Language language;
	private double totalIncludingTaxInBaseCurrency;
	private String senderVatNumber;
	private double totalTax;
	private double workHoursQuantity;
	private boolean isCreditNote;
	private FreeText1 freeText1;
	private Object number;
	private FreeText2 freeText2;
	private double workHoursTotalExcludingTax;
	private String senderName;
	private Object referenceNumber;
	private Object invoiceNumberBusinessUnitGuid;
	private LastUpdatedBy lastUpdatedBy;
	private String yourReference;
	private String entryDate;
	private Object creditNoteInvoice;
	private ReceiverAddress receiverAddress;
	private String senderContactGuid;
	private double totalTaxInBaseCurrency;
	private InvoiceTemplate invoiceTemplate;
	private String guid;
	private int paymentTerm;
	private double flatRatesTotalExcludingTax;
	private Status status;
	private String senderContactName;
	private Object footerHtml;
	private double projectFeesTotalExcludingTax;
	private HtmlText2 htmlText2;
	private HtmlText1 htmlText1;
	private String ourReference;
	private String receiverContactName;
	private double totalExcludingTaxInCompanyCurrency;
	private Object reimburseInvoice;
	private String receiverVatNumber;
	private Currency currency;
	private String receiverContactGuid;
	private boolean canBeDeleted;
	private String receiverCustomerName;
	private String receiverContactEmail;
	private double totalExcludingTax;
	private double projectTravelExpensesTotalExcludingTax;
	private CreatedBy createdBy;
	private double totalTaxInCompanyCurrency;
	private Culture culture;
	private BillingCustomer billingCustomer;
	private double currencyRate;
	private String lastUpdatedDateTime;
	private Object paymentDate;
	private Customer customer;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setTotalIncludingTax(double totalIncludingTax){
		this.totalIncludingTax = totalIncludingTax;
	}

	public double getTotalIncludingTax(){
		return totalIncludingTax;
	}

	public void setOverdueInterest(double overdueInterest){
		this.overdueInterest = overdueInterest;
	}

	public double getOverdueInterest(){
		return overdueInterest;
	}

	public void setSenderAddress(SenderAddress senderAddress){
		this.senderAddress = senderAddress;
	}

	public SenderAddress getSenderAddress(){
		return senderAddress;
	}

	public void setProjects(List<ProjectsItem> projects){
		this.projects = projects;
	}

	public List<ProjectsItem> getProjects(){
		return projects;
	}

	public void setBusinessUnit(BusinessUnit businessUnit){
		this.businessUnit = businessUnit;
	}

	public BusinessUnit getBusinessUnit(){
		return businessUnit;
	}

	public void setOrderNumber(String orderNumber){
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber(){
		return orderNumber;
	}

	public void setNotes(Notes notes){
		this.notes = notes;
	}

	public Notes getNotes(){
		return notes;
	}

	public void setTotalIncludingTaxInCompanyCurrency(double totalIncludingTaxInCompanyCurrency){
		this.totalIncludingTaxInCompanyCurrency = totalIncludingTaxInCompanyCurrency;
	}

	public double getTotalIncludingTaxInCompanyCurrency(){
		return totalIncludingTaxInCompanyCurrency;
	}

	public void setDueDate(String dueDate){
		this.dueDate = dueDate;
	}

	public String getDueDate(){
		return dueDate;
	}

	public void setTotalExcludingTaxInBaseCurrency(double totalExcludingTaxInBaseCurrency){
		this.totalExcludingTaxInBaseCurrency = totalExcludingTaxInBaseCurrency;
	}

	public double getTotalExcludingTaxInBaseCurrency(){
		return totalExcludingTaxInBaseCurrency;
	}

	public void setWorkHourValueAddedTax(double workHourValueAddedTax){
		this.workHourValueAddedTax = workHourValueAddedTax;
	}

	public double getWorkHourValueAddedTax(){
		return workHourValueAddedTax;
	}

	public void setCreatedDateTime(String createdDateTime){
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime(){
		return createdDateTime;
	}

	public void setLanguage(Language language){
		this.language = language;
	}

	public Language getLanguage(){
		return language;
	}

	public void setTotalIncludingTaxInBaseCurrency(double totalIncludingTaxInBaseCurrency){
		this.totalIncludingTaxInBaseCurrency = totalIncludingTaxInBaseCurrency;
	}

	public double getTotalIncludingTaxInBaseCurrency(){
		return totalIncludingTaxInBaseCurrency;
	}

	public void setSenderVatNumber(String senderVatNumber){
		this.senderVatNumber = senderVatNumber;
	}

	public String getSenderVatNumber(){
		return senderVatNumber;
	}

	public void setTotalTax(double totalTax){
		this.totalTax = totalTax;
	}

	public double getTotalTax(){
		return totalTax;
	}

	public void setWorkHoursQuantity(double workHoursQuantity){
		this.workHoursQuantity = workHoursQuantity;
	}

	public double getWorkHoursQuantity(){
		return workHoursQuantity;
	}

	public void setIsCreditNote(boolean isCreditNote){
		this.isCreditNote = isCreditNote;
	}

	public boolean isIsCreditNote(){
		return isCreditNote;
	}

	public void setFreeText1(FreeText1 freeText1){
		this.freeText1 = freeText1;
	}

	public FreeText1 getFreeText1(){
		return freeText1;
	}

	public void setNumber(Object number){
		this.number = number;
	}

	public Object getNumber(){
		return number;
	}

	public void setFreeText2(FreeText2 freeText2){
		this.freeText2 = freeText2;
	}

	public FreeText2 getFreeText2(){
		return freeText2;
	}

	public void setWorkHoursTotalExcludingTax(double workHoursTotalExcludingTax){
		this.workHoursTotalExcludingTax = workHoursTotalExcludingTax;
	}

	public double getWorkHoursTotalExcludingTax(){
		return workHoursTotalExcludingTax;
	}

	public void setSenderName(String senderName){
		this.senderName = senderName;
	}

	public String getSenderName(){
		return senderName;
	}

	public void setReferenceNumber(Object referenceNumber){
		this.referenceNumber = referenceNumber;
	}

	public Object getReferenceNumber(){
		return referenceNumber;
	}

	public void setInvoiceNumberBusinessUnitGuid(Object invoiceNumberBusinessUnitGuid){
		this.invoiceNumberBusinessUnitGuid = invoiceNumberBusinessUnitGuid;
	}

	public Object getInvoiceNumberBusinessUnitGuid(){
		return invoiceNumberBusinessUnitGuid;
	}

	public void setLastUpdatedBy(LastUpdatedBy lastUpdatedBy){
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public LastUpdatedBy getLastUpdatedBy(){
		return lastUpdatedBy;
	}

	public void setYourReference(String yourReference){
		this.yourReference = yourReference;
	}

	public String getYourReference(){
		return yourReference;
	}

	public void setEntryDate(String entryDate){
		this.entryDate = entryDate;
	}

	public String getEntryDate(){
		return entryDate;
	}

	public void setCreditNoteInvoice(Object creditNoteInvoice){
		this.creditNoteInvoice = creditNoteInvoice;
	}

	public Object getCreditNoteInvoice(){
		return creditNoteInvoice;
	}

	public void setReceiverAddress(ReceiverAddress receiverAddress){
		this.receiverAddress = receiverAddress;
	}

	public ReceiverAddress getReceiverAddress(){
		return receiverAddress;
	}

	public void setSenderContactGuid(String senderContactGuid){
		this.senderContactGuid = senderContactGuid;
	}

	public String getSenderContactGuid(){
		return senderContactGuid;
	}

	public void setTotalTaxInBaseCurrency(double totalTaxInBaseCurrency){
		this.totalTaxInBaseCurrency = totalTaxInBaseCurrency;
	}

	public double getTotalTaxInBaseCurrency(){
		return totalTaxInBaseCurrency;
	}

	public void setInvoiceTemplate(InvoiceTemplate invoiceTemplate){
		this.invoiceTemplate = invoiceTemplate;
	}

	public InvoiceTemplate getInvoiceTemplate(){
		return invoiceTemplate;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	public void setPaymentTerm(int paymentTerm){
		this.paymentTerm = paymentTerm;
	}

	public int getPaymentTerm(){
		return paymentTerm;
	}

	public void setFlatRatesTotalExcludingTax(double flatRatesTotalExcludingTax){
		this.flatRatesTotalExcludingTax = flatRatesTotalExcludingTax;
	}

	public double getFlatRatesTotalExcludingTax(){
		return flatRatesTotalExcludingTax;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	public void setSenderContactName(String senderContactName){
		this.senderContactName = senderContactName;
	}

	public String getSenderContactName(){
		return senderContactName;
	}

	public void setFooterHtml(Object footerHtml){
		this.footerHtml = footerHtml;
	}

	public Object getFooterHtml(){
		return footerHtml;
	}

	public void setProjectFeesTotalExcludingTax(double projectFeesTotalExcludingTax){
		this.projectFeesTotalExcludingTax = projectFeesTotalExcludingTax;
	}

	public double getProjectFeesTotalExcludingTax(){
		return projectFeesTotalExcludingTax;
	}

	public void setHtmlText2(HtmlText2 htmlText2){
		this.htmlText2 = htmlText2;
	}

	public HtmlText2 getHtmlText2(){
		return htmlText2;
	}

	public void setHtmlText1(HtmlText1 htmlText1){
		this.htmlText1 = htmlText1;
	}

	public HtmlText1 getHtmlText1(){
		return htmlText1;
	}

	public void setOurReference(String ourReference){
		this.ourReference = ourReference;
	}

	public String getOurReference(){
		return ourReference;
	}

	public void setReceiverContactName(String receiverContactName){
		this.receiverContactName = receiverContactName;
	}

	public String getReceiverContactName(){
		return receiverContactName;
	}

	public void setTotalExcludingTaxInCompanyCurrency(double totalExcludingTaxInCompanyCurrency){
		this.totalExcludingTaxInCompanyCurrency = totalExcludingTaxInCompanyCurrency;
	}

	public double getTotalExcludingTaxInCompanyCurrency(){
		return totalExcludingTaxInCompanyCurrency;
	}

	public void setReimburseInvoice(Object reimburseInvoice){
		this.reimburseInvoice = reimburseInvoice;
	}

	public Object getReimburseInvoice(){
		return reimburseInvoice;
	}

	public void setReceiverVatNumber(String receiverVatNumber){
		this.receiverVatNumber = receiverVatNumber;
	}

	public String getReceiverVatNumber(){
		return receiverVatNumber;
	}

	public void setCurrency(Currency currency){
		this.currency = currency;
	}

	public Currency getCurrency(){
		return currency;
	}

	public void setReceiverContactGuid(String receiverContactGuid){
		this.receiverContactGuid = receiverContactGuid;
	}

	public String getReceiverContactGuid(){
		return receiverContactGuid;
	}

	public void setCanBeDeleted(boolean canBeDeleted){
		this.canBeDeleted = canBeDeleted;
	}

	public boolean isCanBeDeleted(){
		return canBeDeleted;
	}

	public void setReceiverCustomerName(String receiverCustomerName){
		this.receiverCustomerName = receiverCustomerName;
	}

	public String getReceiverCustomerName(){
		return receiverCustomerName;
	}

	public void setReceiverContactEmail(String receiverContactEmail){
		this.receiverContactEmail = receiverContactEmail;
	}

	public String getReceiverContactEmail(){
		return receiverContactEmail;
	}

	public void setTotalExcludingTax(double totalExcludingTax){
		this.totalExcludingTax = totalExcludingTax;
	}

	public double getTotalExcludingTax(){
		return totalExcludingTax;
	}

	public void setProjectTravelExpensesTotalExcludingTax(double projectTravelExpensesTotalExcludingTax){
		this.projectTravelExpensesTotalExcludingTax = projectTravelExpensesTotalExcludingTax;
	}

	public double getProjectTravelExpensesTotalExcludingTax(){
		return projectTravelExpensesTotalExcludingTax;
	}

	public void setCreatedBy(CreatedBy createdBy){
		this.createdBy = createdBy;
	}

	public CreatedBy getCreatedBy(){
		return createdBy;
	}

	public void setTotalTaxInCompanyCurrency(double totalTaxInCompanyCurrency){
		this.totalTaxInCompanyCurrency = totalTaxInCompanyCurrency;
	}

	public double getTotalTaxInCompanyCurrency(){
		return totalTaxInCompanyCurrency;
	}

	public void setCulture(Culture culture){
		this.culture = culture;
	}

	public Culture getCulture(){
		return culture;
	}

	public void setBillingCustomer(BillingCustomer billingCustomer){
		this.billingCustomer = billingCustomer;
	}

	public BillingCustomer getBillingCustomer(){
		return billingCustomer;
	}

	public void setCurrencyRate(double currencyRate){
		this.currencyRate = currencyRate;
	}

	public double getCurrencyRate(){
		return currencyRate;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime){
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime(){
		return lastUpdatedDateTime;
	}

	public void setPaymentDate(Object paymentDate){
		this.paymentDate = paymentDate;
	}

	public Object getPaymentDate(){
		return paymentDate;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}

	public Customer getCustomer(){
		return customer;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"date = '" + date + '\'' + 
			",totalIncludingTax = '" + totalIncludingTax + '\'' + 
			",overdueInterest = '" + overdueInterest + '\'' + 
			",senderAddress = '" + senderAddress + '\'' + 
			",projects = '" + projects + '\'' + 
			",businessUnit = '" + businessUnit + '\'' + 
			",orderNumber = '" + orderNumber + '\'' + 
			",notes = '" + notes + '\'' + 
			",totalIncludingTaxInCompanyCurrency = '" + totalIncludingTaxInCompanyCurrency + '\'' + 
			",dueDate = '" + dueDate + '\'' + 
			",totalExcludingTaxInBaseCurrency = '" + totalExcludingTaxInBaseCurrency + '\'' + 
			",workHourValueAddedTax = '" + workHourValueAddedTax + '\'' + 
			",createdDateTime = '" + createdDateTime + '\'' + 
			",language = '" + language + '\'' + 
			",totalIncludingTaxInBaseCurrency = '" + totalIncludingTaxInBaseCurrency + '\'' + 
			",senderVatNumber = '" + senderVatNumber + '\'' + 
			",totalTax = '" + totalTax + '\'' + 
			",workHoursQuantity = '" + workHoursQuantity + '\'' + 
			",isCreditNote = '" + isCreditNote + '\'' + 
			",freeText1 = '" + freeText1 + '\'' + 
			",number = '" + number + '\'' + 
			",freeText2 = '" + freeText2 + '\'' + 
			",workHoursTotalExcludingTax = '" + workHoursTotalExcludingTax + '\'' + 
			",senderName = '" + senderName + '\'' + 
			",referenceNumber = '" + referenceNumber + '\'' + 
			",invoiceNumberBusinessUnitGuid = '" + invoiceNumberBusinessUnitGuid + '\'' + 
			",lastUpdatedBy = '" + lastUpdatedBy + '\'' + 
			",yourReference = '" + yourReference + '\'' + 
			",entryDate = '" + entryDate + '\'' + 
			",creditNoteInvoice = '" + creditNoteInvoice + '\'' + 
			",receiverAddress = '" + receiverAddress + '\'' + 
			",senderContactGuid = '" + senderContactGuid + '\'' + 
			",totalTaxInBaseCurrency = '" + totalTaxInBaseCurrency + '\'' + 
			",invoiceTemplate = '" + invoiceTemplate + '\'' + 
			",guid = '" + guid + '\'' + 
			",paymentTerm = '" + paymentTerm + '\'' + 
			",flatRatesTotalExcludingTax = '" + flatRatesTotalExcludingTax + '\'' + 
			",status = '" + status + '\'' + 
			",senderContactName = '" + senderContactName + '\'' + 
			",footerHtml = '" + footerHtml + '\'' + 
			",projectFeesTotalExcludingTax = '" + projectFeesTotalExcludingTax + '\'' + 
			",htmlText2 = '" + htmlText2 + '\'' + 
			",htmlText1 = '" + htmlText1 + '\'' + 
			",ourReference = '" + ourReference + '\'' + 
			",receiverContactName = '" + receiverContactName + '\'' + 
			",totalExcludingTaxInCompanyCurrency = '" + totalExcludingTaxInCompanyCurrency + '\'' + 
			",reimburseInvoice = '" + reimburseInvoice + '\'' + 
			",receiverVatNumber = '" + receiverVatNumber + '\'' + 
			",currency = '" + currency + '\'' + 
			",receiverContactGuid = '" + receiverContactGuid + '\'' + 
			",canBeDeleted = '" + canBeDeleted + '\'' + 
			",receiverCustomerName = '" + receiverCustomerName + '\'' + 
			",receiverContactEmail = '" + receiverContactEmail + '\'' + 
			",totalExcludingTax = '" + totalExcludingTax + '\'' + 
			",projectTravelExpensesTotalExcludingTax = '" + projectTravelExpensesTotalExcludingTax + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",totalTaxInCompanyCurrency = '" + totalTaxInCompanyCurrency + '\'' + 
			",culture = '" + culture + '\'' + 
			",billingCustomer = '" + billingCustomer + '\'' + 
			",currencyRate = '" + currencyRate + '\'' + 
			",lastUpdatedDateTime = '" + lastUpdatedDateTime + '\'' + 
			",paymentDate = '" + paymentDate + '\'' + 
			",customer = '" + customer + '\'' + 
			"}";
		}
}