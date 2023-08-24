public class Teacher extends Person 
{
    private String teacherId;
    private String teacherDesignation;
    
    Teacher()
    {
        
    }
    
    Teacher(String type, String name, String gender, int age, String teacherId, String teacherDesignation)
    {
       super(type, name, gender, age);
       this.teacherId = teacherId;
       this.teacherDesignation = teacherDesignation;
    }
    
    void setTeacherId(String teacherId)
    {
        this.teacherId = teacherId;
    }
    void setTeacherDesignation(String teacherDesignation)
    {
        this.teacherDesignation = teacherDesignation;
    }
    
    String getTeacherId()
    {
        return this.teacherId;
    }
    
    String getTeacherDesignation()
    {
        return this.teacherDesignation;
    }
    
    void Display()
    {
        System.out.println("Teacher type: "+getType());
        System.out.println("Teacher name: "+getName());
        System.out.println("Teacher gender: "+getGender());
        System.out.println("Teacher age: "+getAge());
        System.out.println("Teacher ID: "+getTeacherId());
        System.out.println("Teacher designanation: "+getTeacherDesignation());
    }
}
