/* Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array.
Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers.
The function should return X – Y
 */

public class oddEvenSumDiff {
    static int f(int x[]) {
        int X = 0;                                  // Odd Sum
        int Y = 0;                                  // Even Sum

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {                   // If even element
                Y += x[i];
                // System.out.println("Even " + x[i]);

            } else {                                 // If odd element
                X += x[i];
                // System.out.println("Odd " + x[i]);
            }
        }
        return X - Y;
    }

    public static void main(String[] args) {
        int[] myArray = {3, 3, 4, 4};
        System.out.println(f(myArray));
    }
}