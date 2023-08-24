
import java.util.Scanner;
public class Menu {
  void menu(){
    Scanner input = new Scanner(System.in);
      System.out.println("\t\t\t\t\t\t===========================================");
      System.out.println("\t\t\t\t\t\t\t\t  MainMenu");
      System.out.println("\t\t\t\t\t\t===========================================");

      System.out.println("\t\t\t\t\t\t1.  Home");
      System.out.println("\t\t\t\t\t\t2.  Add Doctor ");
      System.out.println("\t\t\t\t\t\t3.  View Doctor List");
      System.out.println("\t\t\t\t\t\t4.  Delete Staff List  ");
      System.out.println("\t\t\t\t\t\t5.  Add Paitent");
      System.out.println("\t\t\t\t\t\t6.  View Paitent List ");
      System.out.println("\t\t\t\t\t\t7.  Delete Paitent List  ");
      System.out.println("\t\t\t\t\t\t8.  Add Staff  ");
      System.out.println("\t\t\t\t\t\t9.  View Staff List  ");
      System.out.println("\t\t\t\t\t\t10. Delete Staff List  ");
      System.out.println("\t\t\t\t\t\t11. Guest Visitor ");

    
     System.out.print("\t\t\t\t\t\t\t\tEnter Your Choice :");
    int n = input.nextInt();

    switch(n){
        case 1:
            Home h = new Home();
            h.introduction();
        case 2:
            Doctor d = new hospital();
            d.adddoctor();
            break;
        case 3:
            Doctor dv = new  hospital();
            dv.viewdoctor();
            break;
        case 4:
             Doctor dt = new  hospital();
            dt.delete();
            break;
        case 5:
            Paitent p = new hospital();
            p.addpaitent();
        case 6:
            Paitent pv = new hospital();
            pv.viewpaitent();
            break;
         case 7:
             Paitent pt = new  hospital();
            pt.pdelete();
            break;
       case 8:
            Staff s = new Staff();
            s.staff();
            break;
        case 9:
            Staff sf = new Staff();
            sf.showstaff();
            break;
        case 10:
             Staff st = new  Staff();
            st.delete();
            break;  
        case 11:
            Guest g = new Guest();
            g.guest();
            break;
        default:
            System.out.println("\t\t\t\t\t\t\t\tInvalid choice");
            Menu m = new Menu();
            m.menu();
  }
    
    }
}

