public class Person
{
	private String name;
	private int id;
	
	public Person()
	{
	System.out.println("Inside empty constructor");	
	}
	public Person(String n,int i)
	{
		name=n;
		id=i;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setId(int i)
	{
		id=i;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public void display()
	{
		System.out.println("The name of the person is :"+name);
		System.out.println("The id of the person is :"+id);
		
	}	
	public static void main(String args[])
	{
		Person p1=new Person();
		Person p2=new Person("Mashrafi",20);
		p2.display();
		p1.setName("Shakib");
		p1.setId(10);
		p1.display();
		System.out.println("The name is :"+p1.getName());
		System.out.println("The id is :"+p1.getId());
		System.out.println("The name is :"+p2.getName());
		System.out.println("The id is :"+p2.getId());
				
	}
}