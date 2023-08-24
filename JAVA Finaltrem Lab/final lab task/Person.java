
public class Person extends Human
{
    private String name;
    private String gender;
    private int age;
    
    Person()
    {
        
    }
    
    Person(String type, String name, String gender, int age)
    {
        super(type);
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    void setName(String name)
    {
        this.name = name;
    }
    void setGender(String gender)
    {
        this.gender = gender;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    
    String getName()
    {
        return this.name;
    }
    String getGender()
    {
        return this.gender;
    }
    int getAge()
    {
        return this.age;
    }
    
}
