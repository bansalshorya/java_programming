import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum=sum*10+ld;
            num=num/10;
        }
        System.out.println(sum);
        System.out.println((original==sum)?"palindrome":"not a palindrome");
    }
}
