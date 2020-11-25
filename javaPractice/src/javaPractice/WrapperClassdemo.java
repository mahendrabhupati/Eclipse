package javaPractice;


public class WrapperClassdemo {
	public static void main(String[] args) {
		B obj = new B();
		obj.setX(1);
		System.out.println(obj.getX());
		int i= 123; // primitive data data type 
		Integer i1= new Integer(i); // n java every thing should be an object " wraping" // 
		// here i1 is reference variable	
		int j= i1.intValue(); //Unwrapping
		System.out.println(j);
	}
}