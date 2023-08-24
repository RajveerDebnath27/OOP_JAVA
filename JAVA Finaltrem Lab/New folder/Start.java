public class Start
{
	public static void main(String arr[])
	{
	    Rectangle r1=new Rectangle();
		r1.setLength(10);
		r1.setWidth(8.55);
		System.out.println("Your length is :"+r1.getLength());
		System.out.println("Your width is :"+r1.getWidth());
		System.out.println("Your area of the Rectangle is :"+r1.getArea());
		
		Triangle t1=new Triangle();
		t1.setHeight(4.45);
		t1.setBase(2.65);
		System.out.println("Your height is :"+t1.getHeight());
		System.out.println("Your base is :"+t1.getBase());
		System.out.println("Your area of the Triangle is :"+t1.getArea());
		
		Circle c1=new Circle();
		c1.setRadius(5.64);
		System.out.println("Your Radius is :"+c1.getRadius());
		System.out.println("Your area of the Circle is :"+c1.getArea());
		
		Square s1=new Square();
		s1.setSide(7.43);
		System.out.println("Your Side is :"+s1.getSide());
		System.out.println("Your area of the Square is :"+s1.getArea());
	}
}