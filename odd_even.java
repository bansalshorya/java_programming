package java_programming;
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a no.: ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
