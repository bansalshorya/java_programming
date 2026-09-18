import java.util.Arrays;

public class TwoInOneArray {
    public static void main(String[] args) {
        int[] array1 = {5, 1, 9};
        int[] array2 = {4, 2, 8, 3};
        int[] combinedArray = new int[array1.length + array2.length];

        for (int i = 0; i < combinedArray.length; i++) {
            if (i < array1.length) {
                combinedArray[i] = array1[i];
            } else {
                combinedArray[i] = array2[i - array1.length];
            }
        }
        Arrays.sort(combinedArray);
        for (int i : combinedArray) {
            System.out.println(i);
        }
    }
}
