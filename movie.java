 // A movie theater has a ticket pricing rules
 // children under 12 year old pay 5$
 // senior 65 year and older pay 7$
 // regular adults 12 - 64 years pay 10$
 // members get a 2$ discount on all ticket price
 // we shall prompt the user to enter their age and whether they are a member or not.
// based on this input the program will determine and then print the ticket price.


package java_programming;

import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        boolean membership=sc.nextBoolean();
        int ticket_price=sc.nextInt();
        
        if (age<12) {
            System.out.println();
        }
        else if (age>=12 && age<=64) {
            System.out.println();
        }
        else{
            System.out.println();
        }
        if(membership==true){
            System.out.println();
        }
    }
}
