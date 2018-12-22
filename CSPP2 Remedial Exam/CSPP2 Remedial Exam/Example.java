class Example {
	int a = 5, b= 10;
	Example(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		Example obj = new Example();
		Example obj1 = new Example(10,20);
		System.out.println(obj.a + obj1.b);
	}
}