public class Box
{
	private double length;
	private double width;
	private double height;
	public Box()
	{
		
	}
	public Box(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double Area()
	{
		double area=getLength()*getWidth()*getHeight();
		return area;
	}	
} 