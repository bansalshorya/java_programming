package BinarySearch;

public class BinarySearchCode {
    static void main() {
        System.out.println(Binary());
    }
    public static boolean Binary() {
        int[] arr={1,2,3,4,23};
        int target=4;
        int n= arr.length;
        int left=0,right=n-1,mid;
        while(left<=right){
            mid=(left+right)/2;
            if (arr[mid]<target) left=mid+1;
            else if (arr[mid]>target) right=mid-1;
            else return true;
        }
        return false;
    }
}
