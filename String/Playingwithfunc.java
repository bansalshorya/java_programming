public class Playingwithfunc {
    public static void main(String[] args) {

        String str1 = "helloworld";
        String str2 = "Javatpoint";

        
        System.out.println("Character at index 0: " + str1.charAt(0));

        
        System.out.println("Length of string: " + str1.length());

        
        System.out.println("Substring from index 2: " + str1.substring(2));

        
        System.out.println("Uppercase: " + str1.toUpperCase());

        
        System.out.println("Lowercase: " + str1.toLowerCase());

        
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }

    }
}