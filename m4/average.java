import java.util.*;
public class average{
	public static void main(String[] args) {
		int sum = 0;
		int n;
		double average;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
        n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter array elements");
		for (int i=0; i<arr.length;i++){
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
		}
		average = ((sum)/arr.length);
		System.out.println("the average of elements in array is :" +average);

	}
}
