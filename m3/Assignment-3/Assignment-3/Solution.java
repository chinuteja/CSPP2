/**
 * @author Teja
 */
import java.util.Scanner;
/**.
 * to find gcd of given two numbers
 */
/*
	Do not modify this main function.
	*/
public final class Solution {
    /**
     * function description
     */
    private Solution() {
        /**
         * this is private constructor
         */
    }
    /**.
     * to take inputs from user
     *
     * @param      args  The arguments
     */

    public static void main(final String[]  args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        //gcd(n1,n2);
        System.out.println(gcd(n1, n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
    /**.
     * to find gcd of given two numbers
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int n1, final int n2) {
        if (n2 != 0) {
            return gcd(n2, n1 % n2);}
        else {
            return n1;
        }
    }
}
