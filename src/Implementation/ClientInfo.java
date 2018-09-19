package Implementation;

public class ClientInfo 
{
	private String name;
	private String address;
	private String phoneNumber;
	private String date;
	private double time;
	
	public ClientInfo()
	{
		
	}
	
	public ClientInfo(String name, String address, String phoneNumber, String date, double time) 
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.date = date;
		this.time = time;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getDate() 
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public double getTime() 
	{
		return time;
	}

	public void setTime(double time) 
	{
		this.time = time;
	}
	
	public String toString()
	{
		return "Name :: " + name + "\n" + "Address :: " + address + "\n" + "Phone :: " + phoneNumber + "\n" + "Date :: "+ date;
	}

}
