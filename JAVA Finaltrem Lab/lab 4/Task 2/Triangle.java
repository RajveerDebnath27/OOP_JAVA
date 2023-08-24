public class Triangle
{
	private double height;
	private double base;
	
	public Triangle()
	{
		
	}
	public Triangle(double height,double base)
	{
		this.height=height;
		this.base=base;
	}
	
	public void setHeight(double height)
	{
		this.height=height;
	}
	public void setBase(double base)
	{
		this.base=base;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	public double getBase()
	{
		return this.base;
	}
	public double getArea()
	{
		double area=0.5*getHeight()*getbase;
		return area;
	}	
} 