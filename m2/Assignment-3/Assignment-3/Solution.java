import java.util.Scanner;
/**.
 * to find power the given number
 */
public final class Solution {
	/**.
	 * to take the input and print reults
	 */
	private Solution() {
		/**.
		 * this is private constructor
		 */
	}
	/*
	Do not modify this main function.
	*/
	/**.
	 * method to calculate power of given input
	 *
	 * @param      args  The arguments
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
	public static long power(final long base,final long exponent){
		if (exponent!=0){

			return (base * power(base,exponent-1));
		}
		else{
			return 1;
		}

	}
}
