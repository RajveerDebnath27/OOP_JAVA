public class Start
{
	public static void main(String args[])
	{
		Pizza p1 = new Pizza();
		p1.setName("Pizza");
		p1.setPrice(450.89);
		p1.setSize("M");
		
		p1.showDetails();
		
		System.out.println("===============================================");
		
		Burger b1 = new Burger();
		b1.setName("Double chesse");
		b1.setPrice(340.50);
		b1.setNumberOfPatties(5);
		
		b1.showDetails();
	}
}