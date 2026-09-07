package Array_ques;

import java.util.Scanner;

public class OneDArray {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int size = 5;

        System.out.println("OneDimensional Method");
        int[] oneD = new int[size];
        InputOneDimensional(oneD);
        PrintOneDimensional(oneD);
        
        System.out.println("TwoDimensional Method");
        int[][] TwoD = new int[3][3];
        InputTwoDimensional(TwoD);
        PrintTwoDimensional(TwoD);
    }
    public static void  PrintOneDimensional(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void PrintTwoDimensional(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void InputOneDimensional(int[] arr) {
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public static void InputTwoDimensional(int[][] arr2D) {
        System.out.println("Enter elements");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j]=sc.nextInt();
            }
        }
    }
}
