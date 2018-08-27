import java.util.Scanner;
public class swap{
	public static void main(String arg[]){
		int a,b,temp;
		Scanner key = new Scanner(System.in);
		System.out.println("enter a numbers" );
		a = key.nextInt();
		b = key.nextInt();
		System.out.println("numbers before swap \n" +a+" \n"+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("the numbers swapped are \n" +a+"\n" +b);

		
	}

}



