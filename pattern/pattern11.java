package pattern;

public class pattern11 {
    public static void pat1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}