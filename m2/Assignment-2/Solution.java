import java.util.Scanner;
/**.
 * program to find roots of equation
 */
public final class Solution {
    /**.
     * to find roots of equation
     */
    private Solution() {
        /**
         * this is the private constructor
         */
    }
    /*
    Do not modify this main function.
    */
    /**.
     * main function to read inputs
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        equation(a, b, c);
    }
    /**.
     * function to calculate roots of equation
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void equation(final int a, final int b, final int c) {
        double x, y, denominator, r;
        final int p = 4;
        r = ((b * b) - (p * a * c));
        denominator = (2 * a);
        x = (-b + Math.sqrt(r)) / denominator;
        y = (-b - Math.sqrt(r)) / denominator;
        System.out.println(x + " " + y);
    }
}
