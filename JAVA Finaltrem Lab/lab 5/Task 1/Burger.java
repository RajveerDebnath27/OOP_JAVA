public class Burger extends FoodItem
{
	private int numberOfPatties;
	
	Burger ( int numberOfPatties)
	{
		
		this.numberOfPatties = numberOfPatties;
	}
	
	Burger()
	{
	}
	
	public void setNumberOfPatties(int numberOfPatties)
	{
		this.numberOfPatties = numberOfPatties;
	}
	
	public int getNumberOfPatties()
	{
		return this.numberOfPatties;
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("The number of patties are: "+getNumberOfPatties());
	}
}



