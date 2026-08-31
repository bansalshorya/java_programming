package pattern;

public class pattern13 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            Main_Pattern.patternFirstHalf(i, '$');
            Main_Pattern.patternSecondHalf(n, i, '1');
            System.out.println();
        }
    }
}
class Main_Pattern{
    int row;
    char ch;
    void getData(){
        row=5;
        ch='$';
    }
    public static void patternFirstHalf(int n,char ch){
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
        }
    }
    public static void patternSecondHalf(int num,int n,char ch){
        for (int i = 1; i <=num-n; i++) {
            System.out.print(ch+" ");
        }
    }
}