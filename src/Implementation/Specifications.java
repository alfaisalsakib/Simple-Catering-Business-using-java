package Implementation;

public class Specifications
{
	private String foodType;
	private String bookingType;
	private int staffNumber;
	private String jobStatus;
	private double totalCost;
	private double paidAmount;
	private double owingAmount;
	
	public Specifications()
	{
		
	}
	
	public Specifications(String foodType,String bookingType ,int staffNumber, String jobStatus, double totalCost, double paidAmount,
			double owingAmount) 
	{
		this.foodType = foodType;
		this.staffNumber = staffNumber;
		this.jobStatus = jobStatus;
		this.totalCost = totalCost;
		this.paidAmount = paidAmount;
		this.owingAmount = owingAmount;
		this.bookingType = bookingType;
	}

	public String getFoodType() 
	{
		return foodType;
	}
	
	public String getBookingType()
	{
		return bookingType;
	}

	public void setBookingType(String bookingType)
	{
		this.bookingType = bookingType;
	}
	
	public void setFoodType(String foodType)
	{
		this.foodType = foodType;
	}

	public int getStaffNumber() 
	{
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber)
	{
		this.staffNumber = staffNumber;
	}

	public String getJobStatus() 
	{
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) 
	{
		this.jobStatus = jobStatus;
	}

	public double getTotalCost() 
	{
		return totalCost;
	}

	public void setTotalCost(double totalCost)
	{
		this.totalCost = totalCost;
	}

	public double getPaidAmount()
	{
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount)
	{
		this.paidAmount = paidAmount;
	}

	public double getOwingAmount()
	{
		return owingAmount;
	}

	public void setOwingAmount(double owingAmount)
	{
		this.owingAmount = owingAmount;
	}			
}
