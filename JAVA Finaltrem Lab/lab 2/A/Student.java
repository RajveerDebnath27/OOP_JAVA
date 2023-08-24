public class Student
{
	private String name;
	private int id;
	private double cgpa;
	public Student()
	{
	System.out.println("Inside empty constructor");	
	}
	public Student(String n,int i,double c)
	{
		name=n;
		id=i;
		cgpa=c;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public void setId(int i)
	{
		id=i;
	}
	public void setCgpa(double c)
	{
		cgpa=c;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void display()
	{
		System.out.println("The name of the Student is :"+name);
		System.out.println("The id of the Student is :"+id);
		System.out.println("The CGPA of the Student is :"+cgpa);
		
	}	
	public static void main(String args[])
	{
		/*Person p1=new Person();*/
		Student s2=new Student("Rajveer",45,3.75);
		s2.display();
		/*p1.setName("Shakib");
		p1.setId(10);
		p1.display();
		System.out.println("The name is :"+p1.getName());
		System.out.println("The id is :"+p1.getId());
		System.out.println("The name is :"+p2.getName());
		System.out.println("The id is :"+p2.getId());*/				
	}
}