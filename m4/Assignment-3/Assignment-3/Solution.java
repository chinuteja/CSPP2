/**.
 * @author Teja
 */

import java.util.Scanner;
public final class Solution {
/**.
 * to convert binary to decimal.
 */
 /*
Do not modify this main function.
*/
private Solution() {
/**.
 * private constructor.
 */
}
/**
 * convert binary to decimal.
 *
 * @param      args  The arguments
 */
public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < n; i++) {
        String s = sc.nextLine();
        String res = binaryToDecimal(s);
        System.out.println(res);
        }
    }
    /**
     * function to calculate the decimal value.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String binaryToDecimal(final String s) {
        int n, i, sum;
        sum = 0;
        n = s.length() - 1;
        for (i = 0; i < s.length(); i++) {
            sum = sum + Integer.parseInt(s.charAt(i) + "") * ((int) Math.pow(2, n));
            n = n - 1;
        }
        return (sum + "");
        }
}
