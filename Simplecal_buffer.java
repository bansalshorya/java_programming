
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simplecal_buffer {
    public static void main(String[] args)throws IOException {
        int num1,num2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1st number: ");
        num1=Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd number: ");
        num2=Integer.parseInt(br.readLine());
        System.out.print("Enter operator: ");
        char operator=br.readLine().charAt(0);
        
    }
}
