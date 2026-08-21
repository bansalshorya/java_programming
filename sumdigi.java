
import java.util.Scanner;

public class sumdigi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum+=ld;
            num=num/10;
        }
        System.out.println(sum);
    }
}
