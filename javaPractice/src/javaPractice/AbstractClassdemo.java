package javaPractice;
// If I want no one to create the object of human class directly then I can make that class 
// which means we can not create obj of abstract class
// as abstract class, we can make objects by "extending" the abstract class 
// we can declare a method and define a method
// if we only declare a method it should be abstract
// the class which extends the Abstract class should define the abstract methods other wise it 
// ... it will be also a abstract class
abstract class Human {
	public abstract void eat();
	public void sleep() {

	}
}

class men extends Human{
	public void eat() {
		System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleping");
	}
}
public class AbstractClassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		men obj= new men();
		obj.eat();
	}

}
