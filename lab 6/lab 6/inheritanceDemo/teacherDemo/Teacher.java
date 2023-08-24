class Teacher extends Person
{
	private String id;
	private double salary;
	Teacher()
	{
	System.out.println("Inside child class empty cons");	
	}
	Teacher(String name,int age,String gender,String id,double salary)
	{
		super(name,age,gender);
		this.id=id;
		this.salary=salary;
		System.out.println("Inside child class param cons");
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getId()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public void showInfo()
	{
		System.out.println("Name is : "+getName());
		System.out.println("Age is : "+getAge());
		System.out.println("gender is : "+getGender());
		System.out.println("Id is : "+id);
		System.out.println("Salary is : "+salary);
		
	}

}
