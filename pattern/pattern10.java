package pattern;

public class pattern10 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            for (int j = (n/2)-i; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.println("* ");
            }
            for (int j = (n/2)-i; j >= 0; j--) {
                System.out.print("  ");
            
            }
            System.out.println();
        }
    }
}
