import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double fahrenheit;
		//System.out.println("enter the temperature in degreesCelsius");
		double degreesCelsius = scan.nextDouble();
		fahrenheit = (degreesCelsius*9/5) + 32;
		System.out.println(fahrenheit);
	}
	/*
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*/
}