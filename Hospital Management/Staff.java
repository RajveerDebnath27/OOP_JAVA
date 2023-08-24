


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Staff {
    String id ,name ,des,gender;
    int age ,phone;
        
    public void staff(){
        Staff[] s = new Staff[10];
     
            try{
           Scanner input = new Scanner(System.in);
           for (int i = 0; i < s.length; i++) {
           File obj = new File("staff.txt");
           System.out.print("\t\t\t\t\t\t\tEnter Id                 :");       
           id= input.nextLine();
           System.out.print("\t\t\t\t\t\t\tEnter name            :");
            name=input.nextLine();
           System.out.print("\t\t\t\t\t\t\tEnter Gender         :");
           gender=input.nextLine();
           System.out.print("\t\t\t\t\t\t\tEnter Age               :");
            age=input.nextInt();
           System.out.print("\t\t\t\t\t\t\tEnter Designation :");
           des=input.nextLine();
           System.out.print("\t\t\t\t\t\t\tEnter Contact         :");
           phone=input.nextInt();            
           FileWriter writer = new FileWriter(obj,true);
           writer.write("ID                    :"+id+"\n");
           writer.write("Name               :"+name+"\n");
           writer.write("Gender            :"+name+"\n");
           writer.write("Age                  :"+name+"\n");
           writer.write("Designation    :"+name+"\n");
           writer.write("Contact            :"+name+"\n");
           writer.flush();
           writer.close(); 

                      
                   }
            }catch(Exception e){
                System.out.println(e);
            }
        
    }
    public void showstaff(){
             
                    try{
             Scanner input = new Scanner (System.in);       
             FileReader reader = new FileReader("staff.txt");         
            BufferedReader bfr = new BufferedReader(reader);
            String text="",temp;
            while((temp=bfr.readLine())!=null){
                text = text+temp+"\n"+"\r";
            }
            System.out.println(text);           
            reader.close();
                        System.out.print("\t\t\t\tEnter Any key  : ");
            char n = input.next().charAt(0);
            if (n=='y') {
                Menu  m = new Menu();
                m.menu();
                    }
                    }catch(Exception e){
                        System.out.println(e);
              Menu m = new Menu();
              m.menu();
                    }
    }
    
    public void delete(){
                   File obj = new File("staff.txt");
                   String path = obj.getAbsolutePath();
                   File filePath = new File(path);
                   filePath.delete();
                   if (filePath.delete()) {
                     System.out.println("File Deleted");
                      Menu m = new Menu();
              m.menu();
        }
                   else{
                     System.out.println("File Not Deleted");
                     Menu m = new Menu();
                     m.menu();

                   }
    }

}