import java.util.Scanner;

public class log {

    public static boolean check(Scanner sc) {
        int pass = 4545;
        System.out.print("Enter password: ");
        int user = sc.nextInt();
        return user == pass;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 3;
        while (attempt > 0) {
            if (check(sc)) {
                System.out.println("Correct pass");
                break;
            } else {
                System.out.println("Wrong guess, attempt left: "+(attempt-1));
            }
            attempt--;
        }
    }
}
