package javaPractice;

public class DemoClass {

	int a,b,c;
	static int x;
	public DemoClass() {
		int a=1;
		int b=4;
		int c=9;
		System.out.println("In constructor" +a+" " +b+" "  + c);
	}
	
	static {
		x=69;
		System.out.println("in static"+" "+  x );
	}
	
	public DemoClass(String hi) {
		String var= "Mahendra";
		System.out.println("constructor"+" " +var );
	} 
}
