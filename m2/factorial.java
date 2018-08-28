import java.util.*;
public class factorial{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter a Number");
		int a = scan.nextInt();
		System.out.println("the factorial of given Number is ");
		System.out.println(fact(a));
    }
    static int fact(int a){
    	if (a>=1){
    	if ((a==1) || (a == 0)){
    		return 1;
    	}
    	else{
    		return a*fact(a-1);
    	}
    	
        }
        return 0;
    }
}