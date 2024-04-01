package Classes;

import java.util.ArrayList;

public class Service {
	
	private int id;
	private String name,description;
	private double price;
	
	public Service (int id, String name, String description, double price)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice(double price)
	{
		return price;
	}
	
	public void setServiceName(String name)
	{
		this.name = name;
	}
	
	public void setServiceDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
}
