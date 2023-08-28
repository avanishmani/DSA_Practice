import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,8,9,1,10};
        System.out.println("Integer array before Sorting !");
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] ans=send(arr);
        System.out.println("Integer array after Merge Sort ! ");
        for(Integer i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int[] send(int[] arr){
        if(arr.length==1)return arr;

        int mid=arr.length/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
        return send(send(left),send(right));

    }


    static int[] send(int[] le,int[] ri){
        int i=0,j=0,k=0;
        int mix[]= new int[le.length+ri.length];
        while(i<le.length && j<ri.length){
            if(le[i]>ri[j]){
                mix[k++]=ri[j++];
            }else {
                mix[k++]=le[i++];
            }
        }
        while(i<le.length){
            mix[k++]=le[i++];
        }
        while(j<ri.length){
            mix[k++]=ri[j++];
        }
        return mix;

    }
}
