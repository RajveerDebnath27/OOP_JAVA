public class Student extends Person
{
    private String studentId;
    
    Student()
    {
        
    }
    
    Student(String type, String name, String gender, int age, String studentId)
    {
        super(type, name, gender, age);
        this. studentId = studentId;
    }
    
    void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }
    
    String getStudentId()
    {
        return this.studentId;
    }
    
    void Display()
    {
        System.out.println("Student type: "+getType());
        System.out.println("Student name: "+getName());
        System.out.println("Student gender: "+getGender());
        System.out.println("Student age: "+getAge());
        System.out.println("Student ID: "+getStudentId());
    }
}
