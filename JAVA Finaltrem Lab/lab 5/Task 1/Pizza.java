public class Pizza extends FoodItem
{
	private String size;
	
	Pizza( String size)
	{
		
		this.size = size;
	}
	
	Pizza()
	{
	}
	
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public String getSize()
	{
		return this.size;
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("The size of the Pizza is: "+getSize());
	}
}
