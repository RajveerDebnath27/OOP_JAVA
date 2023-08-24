class Person
{
	private String name;
	private int age;
	private String gender;
	Person()
	{
	System.out.println("Inside parent class empty cons");	
	}
	Person(String name,int age,String gender)
	{
		this(name,age);
		this.gender=gender;
		System.out.println("Inside parent class param cons 1");
	}
	Person(String name,int age)
	{
		
		this.age=age;
		this.name=name;

		System.out.println("Inside parent class param cons 2");
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	
}
