public class Rectangle
{
	private double length;
	private double width;
	public Rectangle()
	{
		
	}
	public Ractangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	public double getArea()
	{
		double area=getLength()*getWidth();
		return area;
	}	
} 