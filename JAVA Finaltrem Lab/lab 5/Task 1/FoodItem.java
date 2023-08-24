public class FoodItem
{
	private double price;
	private String name;
	public FoodItem()
	{
	System.out.println("Empty constructor");
	}
	public FoodItem(double price, String name)
	{
		this.price = price;
		this.name = name;
	}
	public void setPrice (double price)
	{
		this.price = price;
	}
	public void setName (String name)
	{
		this.name = name;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String getName()
	{
		return this.name;
	}
	public void showDetails()
	{
		System.out.println("The price is: "+price);
		System.out.println("The name is: "+name);
	}
}