package java_programming;
import java.util.Scanner;
public class condition{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the hrs: ");
        int hr=sc.nextInt();
        if(hr>=0 && hr<12){
            System.out.println("Good Morning");
        }
        else if(hr>=12 && hr<18){
            System.out.println("Good Afternoon");
        }
        else if(hr>=18 && hr<24){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Time out of range");
        }
    }
}