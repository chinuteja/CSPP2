import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		System.out.println("enter base");    
        int base = s.nextInt();
        System.out.println("enter exponent");
        int exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
	}
	public static long power(int base,int exponent){
		if (exponent!=0){
			return (base * power(base,exponent-1));
		}
		else{
			return 1;
		}

	}
}
