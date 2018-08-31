
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution {/*
	Do not modify this main function.
	*/
	public static void main(final String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
    public static String binaryToDecimal(String s) {
    	int n,i,sum;
    	sum = 0;
    	n = s.length()-1;
    	for (i=0; i<s.length(); i++){
    		sum = sum + Integer.parseInt(s.charAt(i)+"")*((int)Math.pow(2,n));
            n = n-1;
    	}
    	return (sum+"");
    	
    	}
    	
    	

    

}
