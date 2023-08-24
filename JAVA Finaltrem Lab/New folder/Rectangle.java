public class Rectangle
{
	private double length;
	private double width;
	
	Rectangle()
	{
	}
		
	Rectangle (double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	double getArea()
	{
		double Area = getLength()*getWidth();
		return Area;
	}
	
	
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.setLength(45.45);
		r1.setWidth(46.46);
		System.out.println("The length of the rectangle is: "+r1.getLength());
		System.out.println("The width of the rectangle is: "+r1.getWidth());
		System.out.println("The area of the rectangle is: "+r1.getArea());
	}
	
}
