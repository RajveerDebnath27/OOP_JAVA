public class Circle
{
	private double radius;
	
	
	public Circle (){}
	
	public Circle (double radius)
	{
		this.radius=radius;
		
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}

   

    public double getRadius()
	{
		return this.radius
	}

  
	
	public double getArea()
	{
		double area= ( 3.1416*getRadius()*getRadius());
		return area;
	}
}