import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	public static void rootsOfQuadraticEquation(int a, int b, int c)
	{
		double x, y, denominator, r;
		r = ((b * b) - (4 * a * c));
		denominator = (2 * a);
		x = (-b + Math.sqrt(r)) / denominator;
		y = (-b - Math.sqrt(r)) / denominator;
		System.out.println(+x+" "+y);
				
        
	}
}
