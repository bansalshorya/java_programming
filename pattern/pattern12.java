package pattern;

public class pattern12 {
    public static void pat2(int n,char ch1,char ch2) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch1+" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(ch2+" ");
            }
            System.out.println();
        }
    }
}