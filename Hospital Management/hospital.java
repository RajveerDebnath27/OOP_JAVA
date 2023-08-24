
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;


 class hospital implements Doctor ,Paitent {
     Staff[] staffs;
    public void adddoctor(){
        String name,des,id,time;
        int phone;
                  
        try{
            
            Scanner input = new Scanner(System.in);
            File obj = new File("doctor.txt");
            obj.createNewFile();
            System.out.print("\t\t\t\t\tEnter Doctor's ID :");
            id=input.nextLine();
            System.out.print("\t\t\t\t\tEnter Doctor Name :");
            name= input.nextLine();
            System.out.print("\t\t\t\t\tEnter Designation :");
            des=input.nextLine();
            System.out.print("\t\t\t\t\tEnter Time  :");
            time=input.nextLine();
            System.out.print("\t\t\t\t\tEnter Contact Number :");
            phone=input.nextInt();

           FileWriter writer = new FileWriter(obj,true);
           writer.write("---------------------------------------------\n");
           writer.write("ID            :"+id+"\n");
           writer.write("Name       :"+name+"\n");
           writer.write("Speacilist: "+des+"\n");
           writer.write("Time        :"+time+"\n");
           writer.write("Contact   :"+phone+"\n");
           writer.flush();
           writer.write("---------------------------------------------\n");
           writer.close();   
            System.out.println("\n");
            System.out.print("Add more ( yes / no ) :  ");
            String y = input.next();
            String n = null;
            if (y =="yes") {
                adddoctor();
            }
            else {
                Menu m = new Menu();
                m.menu();
            }

        }catch(IOException e){
            System.out.println(e);
            Menu m = new Menu();
            m.menu();
        }
    
    }
            public void viewdoctor(){
        try{
            Scanner input = new Scanner(System.in);           
            FileReader reader = new FileReader("doctor.txt");         
            BufferedReader bfr = new BufferedReader(reader);
            String text="",temp;
            while((temp=bfr.readLine())!=null){
                text = text+temp+"\n"+"\r";
            }
            System.out.println(text);           
            reader.close();
            System.out.print("\t\t\t\t\t\t\t\tEnter Any key  : ");
            char n = input.next().charAt(0);
            if (n=='y') {
                Menu  m = new Menu();
                m.menu();
            }
        }
        catch(IOException e){            
            System.out.println(e);
            Menu  m = new Menu();
            m.menu();          
        }
             
    }
                public void delete(){
                   File obj = new File("doctor.txt");
                   String path = obj.getAbsolutePath();
                   File filePath = new File(path);
                   filePath.delete();
                   if (filePath.delete()) {
                     System.out.println("\t\t\t\t\t\t\t\tFile Deleted");
                      Menu m = new Menu();
                     m.menu();
        }
                   else{
                     System.out.println("\t\t\t\t\t\t\t\tFile Not Deleted");
                     Menu m = new Menu();
                     m.menu();

                   }
    }
    public void addpaitent(){
        String pid, pname, disease, sex, admit_status;
        int age;
        try{
        File obj = new File("paitent.txt");
        obj.createNewFile();
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t\t\t\tEnter ID   :");
        pid = input.nextLine();
        System.out.print("\t\t\t\t\tEnter Name :");
        pname = input.nextLine();
        System.out.print("\t\t\t\t\tEnter Disease  :");
        disease = input.nextLine();
        System.out.print("\t\t\t\t\tEnter Gender :");
        sex = input.nextLine();
        System.out.print("\t\t\t\t\tEnter Status  :");
        admit_status = input.nextLine();
        System.out.print("\t\t\t\t\tEnter Age :");
        age = input.nextInt();
        
        FileWriter writer  = new FileWriter(obj,true);
        writer.write("---------------------------------------------\n");
        writer.write("ID          :"+pid+"\n");
        writer.write("Name    :"+pname+"\n");
        writer.write("Disease :"+disease+"\n");
        writer.write("Gender :"+sex+"\n");
        writer.write("Status   :"+admit_status+"\n");
        writer.write("Age       :"+age+"\n");
        writer.flush();
        writer.write("---------------------------------------------\n");
        writer.close();
            System.out.println("\n");
            System.out.print("Add more ( yes / no ) :  ");
            String y = input.next();
            String n = null;
            if (y =="yes") {
                addpaitent();
            }
            else {
                Menu m = new Menu();
                m.menu();
            }        
        }catch(IOException e ){
            System.out.println(e);
        }
    }
    public void viewpaitent() {
        try{
            Scanner input = new Scanner(System.in);
        
                    FileReader reader = new FileReader("paitent.txt");
                    BufferedReader bfr= new BufferedReader(reader);
                    String text = "",temp;
                    while((temp=bfr.readLine())!=null){
                        text=text+temp+"\n"+"\r";
                    }
                    System.out.println(text);
                    reader.close();
            System.out.print("\t\t\t\t\t\t\t\tEnter Any key  : ");
            char n = input.next().charAt(0);
            if (n=='y') {
                Menu  m = new Menu();
                m.menu();
        }
        }catch(IOException e){
            System.out.println(e);
            Menu m = new Menu();
            m.menu();
        }
    }
        public void pdelete(){
                   File obj = new File("paitent.txt");
                   String path = obj.getAbsolutePath();
                   File filePath = new File(path);
                   filePath.delete();
                    
                   if (filePath.delete()) {
                     System.out.println("\t\t\t\t\t\t\t\tFile Deleted");
                                   Menu m = new Menu();
              m.menu();
        }
                   else{
                     System.out.println("\t\t\t\t\t\t\t\tFile Not Deleted");
                                   Menu m = new Menu();
              m.menu();

                   }
    }

 
}
