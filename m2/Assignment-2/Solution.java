import java.util.Scanner;

public class Solution {
    /**
     * to find roots of equation
     */
    /*
    Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        equation(a, b, c);
    }
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
