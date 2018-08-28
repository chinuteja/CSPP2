import java.util.*;
public class compare{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter varA");
		int varA = scan.nextInt();
		System.out.println("enter varB");
		int varB = scan.nextInt();
		if (varA == varB){
			System.out.println("equal");
		}
		else if (varA>varB){
			System.out.println("bigger");
		}
		else{
			System.out.println("smaller");
		}


	}
}