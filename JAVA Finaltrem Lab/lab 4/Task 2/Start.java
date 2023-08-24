public class Start
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.setLength(50.00);
		r1.setWidth(30.00);
		System.out.println("The length of the rectangle is: "+r1.getLength());
		System.out.println("The width of the rectangle is: "+r1.getWidth());
		System.out.println("The area of the rectangle is: "+r1.getArea());
		
		Triangle t1 = new Triangle();
		t1.setHeight(50.50);
		t1.setBase(70.45);
		System.out.println("The height of the triangle is: "+t1.getHeight());
		System.out.println("The base of the triangle is: "+t1.getBase());
		System.out.println("The area of the triangle is: "+t1.getArea());
	}
}	