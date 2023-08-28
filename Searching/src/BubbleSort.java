public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,8,9,1,10};
        System.out.println("Integer array before Sorting !");
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] ans=send(arr);
        System.out.println("Integer array after bubble Sort ! ");
        for(Integer i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int[] send(int[] arr){
//        return null;
        int i, j, temp, n=arr.length;;

        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        return arr;
    }
}
