
import java.util.Scanner;

public class Home {
        public void introduction(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("\t\t\t\t In this present world,any infectious disease can spread very quickly. If we want   ");
        System.out.println("\t\t\t\t to prevent an infectious disease, then a temporary hospital has to ");
        System.out.println("\t\t\t\t be built quickly. If we built a temporary hospital then first ");
        System.out.println("\t\t\t\t the whole hospital activities. besides, a hospital");
        System.out.println("\t\t\t\t can be managed by a developed management software.");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t     This is project about HOSPITAL MANAGEMENT SYSTEM.");
        System.out.println("\t\t\t\t\t  This is created by four student from  CSE  department ");
        System.out.println("\t\t\t\t\t       at AIUB.The student details are given below");
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\t         1.Kazi Shifatur Rahman");
        System.out.println("\t\t\t\t\t\t         2.Rajveer Debnath Apurba");
        System.out.println("\t\t\t\t\t\t         3.Karmokar Hridoy ");
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t\t\t\tEnter Any key  : ");
        char n = input.next().charAt(0);
        if (n=='y') {
        Menu  m = new Menu();
        m.menu();
        }

    }
}
