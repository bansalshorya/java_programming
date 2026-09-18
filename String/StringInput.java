import java.util.Arrays;
import java.util.Scanner;
public class StringInput {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }
        Arrays.sort(students);
        System.out.println("\nThe 5 students are:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        sc.close();
    
    }
}
