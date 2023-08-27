package Arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;

        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            boolean found = false;

            // Check if i is present in arr
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            // If i was not found in arr, it is a missing number
            if (!found) {
                System.out.println(i);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Iterate from 1 to n and print the numbers that are not in the HashSet
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
    }

