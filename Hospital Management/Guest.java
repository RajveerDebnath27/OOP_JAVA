
import java.util.Scanner;

public class Guest {
    public void guest(){
        System.out.println("\t\t\t\t\t===========================================");
        System.out.println("\t\t\t\t\t\tDHAKA MEDICAL HOSPITAL");
        System.out.println("\t\t\t\t\t===========================================");

        System.out.println("\t\t\t\t\tType                : Public Medical Hospital ");
        System.out.println("\t\t\t\t\tEstablisshed : 1946");
        System.out.println("\t\t\t\t\tPrinciple           :  Khan Abul Kalam Azad");
        System.out.println("\t\t\t\t\tDirector            : Brig. Gen. Mohammod Nasir Uddin");
        System.out.println("\t\t\t\t\tLocation            : Ramna, Dhaka ,Bangladesh");
        System.out.println("\t\t\t\t\tCampus              : 25 cores(10 ha)");
        System.out.println("\t\t\t\t\tLanguage            : Bangla , English");
        System.out.println("\t\t\t\t\tWebsite             : www.dmc.gov.bd");
        System.out.println("\t\t\t\t\tHelpline            : 01768793284,01674952841");
        System.out.println("\n");  
        System.out.println("\t\t\t\t\tHOSPITAL INTERNAL EXPANSES ");
         System.out.println("\t\t\t\t\t===========================================");       
        System.out.println("\t\t\t\t\tX-Ray            : 800 ");
        System.out.println("\t\t\t\t\tCT Scan          :1200");
        System.out.println("\t\t\t\t\tOR Scan          :500");
        System.out.println("\t\t\t\t\tBlood Bank       :250");
        System.out.println("\n");
        System.out.println("\t\t\t\t\tHOSPITAL EXTERNAL EXPANSES");
        System.out.println("\t\t\t\t\t===========================================");
        System.out.println("\t\t\t\t\tAmbulance ");
        System.out.println("\t\t\t\t\tAdmit Facility");
        System.out.println("\t\t\t\t\tCanteen");
        System.out.println("\t\t\t\t\tEmergency");
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
