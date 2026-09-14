

public class Duplicate_elements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 2, 4, 1, 5};
        System.out.print("Duplicate elemets: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
