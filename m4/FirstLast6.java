import java.util.*;
public class FirstLast6{
	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter n the size of array");
		n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("enter array elements");
		for (int i=0;i<a.length;i++){
			
			a[i] = scan.nextInt();
			//System.out.println(a[i]);
		}
		//System.out.println(a);
		System.out.println(Arrays.toString(a));// to give entire array
		//  for (int k : a){
		//  	System.out.println(a);

		if (a[0] == 6 || a[a.length-1] == 6) {
			System.out.println("true");
				
			}
		else {
			System.out.println("false");
			}
		}
	}
