package Arrays;

import java.util.Arrays;

/*Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.*/
public class CountOfTriplates {
    static int countTriplet(int arr[], int n) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (arr[j] + arr[k] == arr[i]) {
                    count++;
                    j++;
                    k--;
                }
                else if (arr[j] + arr[k] < arr[i])
                    j++;
                else
                    k--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int N = 4;
        int arr[] = {1, 5, 3, 2};
        System.out.println( countTriplet(arr,N));
    }
}
