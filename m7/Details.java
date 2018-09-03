import java.util.*;
class Details {
	String name;
	String id;
	double subject1;
	double subject2;
	double subject3;
	double average;
	public Details(String name, String id , double subject1, double subject2, double subject3) {
		this.name = name;// this is constructor to load the data
		this.id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		//System.out.println(subject1 + " " + subject2 + " " + subject3 + " " + m1 + " " + m2 + " " + m3);
	}
	public void GPA() {
		average = (subject1 + subject2 + subject3) / 3;
		System.out.println(average);

	}
}
class Student {
	public static void main(String[] args) {
		Details d1 = new Details("teja", "12K81A0224", 7.0, 7.5, 8.0);
		d1.GPA();
		Details d2 = new Details("chinu","24",8.5,8.0,8.1);
		d2.GPA();
	}
}