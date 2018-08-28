import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		//System.out.println("enter base");    
        long base = s.nextInt();
       // System.out.println("enter exponent");
        long exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
	}
	public static long power(long base,long exponent){
		if (exponent!=0){

			return (base * power(base,exponent-1));
		}
		else{
			return 1;
		}

	}
}
