//WAP to read and print an array. Also find greatest and smallest elemnt in array

public class Smallest_largestInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,32,1,23,-1};
        int n=arr.length,i=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(i<n){
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
            i++;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
