package Arrays;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {

  static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int[] arr2 = productExceptSelf(arr);
    System.out.println("The product of the array is:");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }

  }

  public static int[] productExceptSelf(int[] nums) {

    int[] sample = new int[nums.length];
    sample[0] =1;
    int i=1;
    while(i<nums.length){
      int j= nums[i-1];
      sample[i]= sample[i-1]*j;
      i++;
    }
    System.out.println(" sample output ");
    for (i = 0; i < sample.length; i++) {
      System.out.print(sample[i] + " ");
    }
    int j=nums.length-1;
    int rem =1;
    while(j>=0){
      int temp = nums[j];
      nums[j] = sample[j]* rem;
      rem = rem*temp;
      j--;

    }
    return nums;
  }
}
