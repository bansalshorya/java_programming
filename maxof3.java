package java_programming;
public class maxof3 {
    // public static void main(String[] args) {
    //     int a=20,b=40,c=10;
    //     if(a>=b && a>=c){
    //         System.out.println("A");
    //     }
    //     else if(b>=a && b>=c){
    //         System.out.println("B");
    //     }
    //     else{
    //         System.out.println("C");
    //     }
    // }

    public static void main(String[] args) {
        int a=20,b=40,c=10;
        int max=Math.max(a, Math.max(c, b));
        System.out.println(max);
    }
}
