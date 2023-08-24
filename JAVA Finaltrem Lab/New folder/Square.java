public class Square
{
	private double side;
	
	
	public Square (){}
	
	public Square (double side)
	{
		this.side=side;
		
	}
	public void setSide(double side)
	{
		this.side=side;
	}

   

    public double getSide()
	{
		return this.side;
	}

  
	
	public double getArea()
	{
		double area= getSide()*getSide();
		return area;
	}
}
