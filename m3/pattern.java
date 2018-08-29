import java.util.*;
public class pattern{
	public static void main(String[] args) {
		int i,j,n;
		String s = " ";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a Number");
		n = scan.nextInt();
		for (i=1;i<=n;i++){
			for (j=1;j<=i;j++){
				System.out.print(j+s);
			}
			System.out.println();
		}
	}
}