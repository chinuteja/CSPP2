import java.util.*;
public class Concatinate{
	public static void main(String[] args) {
		String s1 = "Hello";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a name");
		String s2 = scan.nextLine();
		System.out.println(s1.concat(" "+s2+"!"));
	}
}