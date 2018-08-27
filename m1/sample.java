import java.util.Scanner;
public class sample {
	public static void main (String a[]){
		int c;
		double d;
		Scanner key = new Scanner(System.in);
		System.out.println("enter values of a and b");
		int x = key.nextInt();
		int b = key.nextInt();
		d = x/b;
		System.out.println(d);
		c = x%b;
		System.out.println(c);

	}
}