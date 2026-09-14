

public class inout_arr{
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size=sc.nextInt();int e_sum=0;int o_sum=0;
        // int[] arr=new int[size];
        // for (int i = 0; i < size; i++) {
        //     arr[i]=sc.nextInt();
        //     if(arr[i]%2==0) e_sum+=arr[i];
        //     else o_sum+=arr[i];
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }System.out.println();
        // System.out.println("Even sum: "+ e_sum);
        // System.out.println("Odd sum: "+o_sum);

        // //selection sorting
        // for (int i = 0; i < arr.length; i++) {
        //     int mindx=0;int max=Integer.MIN_VALUE;
        //     for (int j = i; j < arr.length; j++) {
        //         if(max<arr[j]){
        //             max=arr[j];
        //             mindx=j;
        //         }
        //     }
        //     int temp=arr[mindx];
        //     arr[mindx]=arr[i];
        //     arr[i]=temp;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }System.out.println();
        
        
        
        // //bubble sort
        // for (int k = 0; k <size-1 ; k++) {

        //     for (int i = 0; i < size-1-k; i++) {
        //         if (arr[i] > arr[i + 1]) {
        //             int temp = arr[i];
        //             arr[i] = arr[i + 1];
        //             arr[i + 1] = temp;

        //         }
        //     }

        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }System.out.println();
        

        int[] arr={2,3,42,1,-2};
        //insertions sort
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(j!=0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }System.out.println();

    }
}