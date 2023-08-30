import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,10,55,12,9};
        int k=55;
        Arrays.sort(arr);
        int ans=send(arr,k,0,arr.length-1);
        System.out.println(ans +" is the index for value in array !");
    }
    static int  send(int[] arr,int k,int s,int e){
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==k){
                ans=m;
                break;
            }
            if(arr[m]>k){
                e=m-1;
            }if(arr[m]<k){
                s=m+1;
            }
        }
        return ans;
    }
}
