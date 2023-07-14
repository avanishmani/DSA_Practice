package Arrays;

import java.util.Scanner;

public class SubArrayWithSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Arrays");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i=0;
        while(i<n){
            System.out.println("Enter element in Array at index "+ i);
            int j=sc.nextInt();

                arr[i++]=j;

        }
        System.out.println("enter the total sum that You want !");
        int sum=sc.nextInt();
        i=0;
        int e=1;
        int r=0;
        String ans="Not found";
        while(i<=e&&e<n){
            r=arr[i]+arr[e];
            if(r<sum){
               e++;
            }else if(r>sum){
                i++;
            }else{
                ans+=(i+1)+" "+(e+1);
                break;
            }
        }
        System.out.println(ans);
    }
}
