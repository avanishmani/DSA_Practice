package Strings;

import java.util.Scanner;

public class StringBufferReturn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String You want to Reverse!");
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i< arr.length;i++){
            if(arr[i].length()%2==0){
                StringBuffer sm=new StringBuffer(arr[i]);
                sb.append(sm.reverse());

            }else {
                sb.append(arr[i]);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString()+" ");

    }
}
