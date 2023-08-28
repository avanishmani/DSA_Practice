public class SelectionSort {
    public static void main(String[] args) {


    int[] arr={2,5,4,8,9,1,10};
        System.out.println("Integer array before Sorting !");
        for(Integer i:arr){
        System.out.print(i+" ");
    }
        System.out.println();
    int[] ans=send(arr);
        System.out.println("Integer array after Selection Sort ! ");
        for(Integer i:ans){
        System.out.print(i+" ");
    }
        System.out.println();
}
    static int[] send(int[] arr){
//        return null;
        int i, j, temp, n=arr.length;;


        for (i = 0; i < n - 1; i++) {
            int min=i;

            for (j = i+1; j < n ; j++) {
                if (arr[min] > arr[j]) {

                    // Swap arr[j] and arr[j+1]
                    min=j;

                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            // If no two elements were
            // swapped by inner loop, then break

        }
        return arr;
    }
}
