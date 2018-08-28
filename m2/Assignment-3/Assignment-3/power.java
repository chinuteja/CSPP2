import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		//System.out.println("enter base");    
        double base = s.nextInt();
       // System.out.println("enter exponent");
        int exponent = s.nextInt();
        double result=power(base,exponent);
        System.out.println(result);
	}
	public static double power(double base,int exponent){
		if (exponent!=0){
			if (exponent < 0){
				base = (1/base);
				exponent = - exponent;
			}

			return (base * power(base,exponent-1));
		}
		else{
			return 1;
		}

	}
}

