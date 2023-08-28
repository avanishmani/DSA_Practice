public class BubbleSortRecursion {

    static void send(int[] arr,int n){

       if(n==1)
           return ;


//        int count=0;
        for (int j = 0; j < n - 1; j++) {


                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                  count++;

            }

            // If no two elements were
            // swapped by inner loop, then break
//            if (count==0)
//                return ;


        }

         send(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr={2,5,4,8,9,1,10};
        System.out.println("Integer array before Sorting !");
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        send(arr,arr.length);
        System.out.println("Integer array after bubble Sort ! ");
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
