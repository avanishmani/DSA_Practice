package Arrays;

import java.util.Scanner;

public class TwoNumberSwapingInPlace {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X and Y ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("So the value of X and Y is :- "+x+" and "+y);
         x=x+y;
         y=x-y;
         x=x-y;
        System.out.println("So the final value of X and Y is :- "+x+" and "+y);
    }
}
