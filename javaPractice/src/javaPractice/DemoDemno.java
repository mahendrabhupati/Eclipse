package javaPractice;

interface a {

	static void show() {
		System.out.println("static method in Interface");
	}
	 
	public default void run() {
		System.out.println("default method in Interface");
	}
}
class bd implements a{
	
}
public class DemoDemno extends bd{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj = new DemoDemno();//
		a.show();
		a.run();
		
	}
}
