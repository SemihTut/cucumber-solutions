package VismaSolutions.POJO.ProjectTravelExpenses;

public class TravelReimbursement{
	private boolean isLocked;
	private String guid;
	private boolean isApproved;
	private String status;

	public void setIsLocked(boolean isLocked){
		this.isLocked = isLocked;
	}

	public boolean isIsLocked(){
		return isLocked;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	public void setIsApproved(boolean isApproved){
		this.isApproved = isApproved;
	}

	public boolean isIsApproved(){
		return isApproved;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"TravelReimbursement{" + 
			"isLocked = '" + isLocked + '\'' + 
			",guid = '" + guid + '\'' + 
			",isApproved = '" + isApproved + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
