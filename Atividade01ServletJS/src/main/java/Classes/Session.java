package Classes;

public class Session {
	
	private int id,serviceId;
	private String date, time;
	
	public Session(int id, int serviceId,String date, String time)
	{
		this.id = id;
		this.serviceId = serviceId;
		this.date = date;
		this.time = time;
	}
	
	public int getSessionId(int id) {
		return id;
	}
	
	public int getServiceId(int serviceId)
	{
		return serviceId;
	}
	
	public String date(String date)
	{
		return date;
	}
	
	public String time(String time)
	{
		return time;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
}
