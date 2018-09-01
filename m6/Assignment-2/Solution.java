import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : Teja
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, final int rows,
                                final int columns) {
        final int zero = 0;
        final int fifty = 50;
        final int onehundred = 100;
        final int onefifty = 150;
        final int twohundred = 200;
        final int twofifty = 250;
        final int threehundred = 300;
        final int threefifty = 350;
        final int fourhundred = 400;
        final int fourfifty = 450;
        final int fivehundred = 500;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] > zero && a[i][j] < fifty) {
                    a[i][j] = zero;
                } else if (a[i][j] >= fifty && a[i][j] < onefifty) {
                    a[i][j] = onehundred;
                } else if (a[i][j] >= onefifty && a[i][j] < twofifty) {
                    a[i][j] = twohundred;
                } else if (a[i][j] >= twofifty && a[i][j] < threefifty) {
                    a[i][j] = threehundred;
                } else if (a[i][j] >= threefifty && a[i][j] < fourfifty) {
                    a[i][j] = fourhundred;
                } else  {
                    a[i][j] = fivehundred;
                }
            }
        }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}


