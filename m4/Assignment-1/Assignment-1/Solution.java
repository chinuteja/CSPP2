/**
 * @author teja
 */
import java.util.Scanner;
/**
 * to find maximum element in an array.
 */
public final class Solution {
/**.
 * to find maximum element in a array
 */
    private Solution() {
        /**
         * this is private constructor
         */

    }
    /**.
     * program to find maximum element in a array
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                arr[j + 1] = arr[j];
            }
        }
        System.out.println(arr[j]);
    }
}

