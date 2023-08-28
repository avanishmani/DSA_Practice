public class QuickSort {

    public static void main(String[] args) {
        int[] arr={2,5,4,8,9,1,10,5,10};
        System.out.println("Integer array before Sorting !");
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        send(arr,0,arr.length-1);
        System.out.println("Integer array after Quick Sort ! ");
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void send(int[] arr,int s,int e){
        if(s>=e)return;
        int p=Partition(arr,s,e);
        send(arr,s,p-1);
        send(arr,p+1,e);
        return ;

    }
    static int Partition(int[] arr,int s,int e){
        int p=arr[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<p){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Swap pivot element with element at index i+1
        int temp = arr[i+1];
        arr[i+1] = arr[e];
        arr[e] = temp;

        return i+1;
    }
}
