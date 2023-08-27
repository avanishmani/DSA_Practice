package Arrays;

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6};
        int n = 6;

        // Calculate the sum and sum of squares
        int sum = 0, sumOfSquares = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumOfSquares += arr[i] * arr[i];
        }

        // Subtract the sum and sum of squares of first n natural numbers
        int xMinusY = sum - n*(n+1)/2;
        int xSquareMinusYSquare = sumOfSquares - n*(n+1)*(2*n+1)/6;

        // Calculate x + y
        int xPlusY = xSquareMinusYSquare / xMinusY;

        // Solve for x and y
        int x = (xPlusY + xMinusY) / 2;
        int y = (xPlusY - xMinusY) / 2;

        System.out.println("Repeating Number: " + x);
        System.out.println("Missing Number: " + y);
    }
}
