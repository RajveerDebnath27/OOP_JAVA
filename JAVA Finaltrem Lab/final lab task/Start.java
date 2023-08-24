
public class Start 
{
    public static void main(String args[])
    {
        System.out.println("Teacher class for parameterized constructor");
        Teacher t1 = new Teacher("Human","Mushfiq","Male",29,"8634","Lecturer");
        t1.Display();
        
        System.out.println("=========================================================");
        
        System.out.println("Teacher class for Setter Getter");
        t1.setType("Human");
        t1.setName("Mushfiq");
        t1.setGender("Male");
        t1.setAge(29);
        t1.setTeacherId("8634");
        t1.setTeacherDesignation("Lecturer");
        
        t1.Display();
        
        System.out.println("=========================================================");
        
        System.out.println("Student class for parameterized constructoor");
        
        Student s1 = new Student("Human","Rajveer","Male",20,"41512");
        s1.Display();
        
        System.out.println("=========================================================");
        
        System.out.println("Student class for Setter Getter");
        
        s1.setType("Human");
        s1.setName("Rajveer");
        s1.setGender("Male");
        s1.setAge(20);
        s1.setStudentId("41512");
        
        s1.Display();
    
    }
}
