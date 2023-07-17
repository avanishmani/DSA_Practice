package Arrays;

import java.util.Arrays;

public class MissingNumberInArray {
    static int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int x=-1;
        for(int i=1;i<n;i++){
            if(i!=array[i-1]){
                x=i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int N = 10;
        int A[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(A,N));
    }
}
