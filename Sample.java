package java_programming;

public class Sample {
    static int x=10; 
    public static void main(String[] args) {
        System.out.println("Helooooo!");
        Sample2 obj=new Sample2();
        obj.display();
    }
    
}
class Sample2{
    void display(){
        Sample.x=20;
        System.out.println("This is 2nd class");
    }
}
