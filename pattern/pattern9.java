package pattern;
import java.util.Scanner;
public class pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star = 1;
		int row = 0;
		while(row<n) {

            int j = 1;
            while(j<=space) {
                System.out.print(" ");
                j++;
            }


			int i = 0;
			int ncr = 1;
			while(i<star) {
				System.out.print(ncr+" ");
				ncr = (ncr*(row-i)) / (i+1);
				i++;
			}
			row++;
            space--;
			System.out.println();
			star++;
		}
	}
}