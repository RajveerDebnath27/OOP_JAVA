public class Start
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.setLength(10);
		b1.setHeight(10);
		b1.setWidth(5);
		System.out.println("Your height is :"+b1.getHeight());
		System.out.println("Your length is :"+b1.getLength());
		System.out.println("Your width is :"+b1.getWidth());
		System.out.println("Your area of the box is :"+b1.Area());
		
	}
}