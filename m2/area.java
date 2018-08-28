// import java.util.*;
// public class area{
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		System.out.println("enter radius of circle");
// 		double radius =  scan.nextDouble();
// 		double area;
// 		double pi = 3.141;
// 		area = pi*radius*radius;
// 		System.out.println("the area of circle");
// 		System.out.print(area);
// 	}
// }
import java.util.*;
public class area{
	static double cal_area(int r){
		//Scanner scan = new Scanner(System.in);
        double ar;
		ar = pi()*r*r;
		return ar;

	}
	static double pi(){
		return 3.141;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r;
		System.out.println("enter radius of circle");
		r = scan.nextInt();
		System.out.println(cal_area(r));
	}
}