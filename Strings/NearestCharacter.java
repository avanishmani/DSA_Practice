package Strings;

import java.util.Scanner;

public class NearestCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Character Array !");
        int l=sc.nextInt();
        char[] arr=new char[l];
        for(int i=0;i<l;i++){
            System.out.println("Enter the character at index :- "+i);
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("Enter the target char near which u want character ! ");
        char target=sc.next().charAt(0);
        System.out.println(
                nextGreatestLetter(arr,target)
        );
    }
    public static  char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid]==target)
            {
                start=mid+1;
            }
            else if(target>letters[mid])
            {
                start=mid+1;
            }
            else if(letters[mid]>target)
            {
                res=letters[mid];
                end=mid-1;
            }
        }
        return res;

    }
}
