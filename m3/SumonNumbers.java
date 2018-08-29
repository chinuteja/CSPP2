import java.util.*;
public class SumonNumbers{
	public static void main(String[] args) {
		int n,sum,i;
		sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a Number");
		n = scan.nextInt();
		for(i=0;i<=n;i++){
			sum = sum + i;
		}
		System.out.print("sum of n numbers is ");
        System.out.println(sum);
	}
}