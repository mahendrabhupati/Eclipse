package javaPractice;

//1. The use of  interface  is to achieve multiple inheritance
//2. We can only declare the menthods but can not define it
//3. We cannot create object of interface but
//we can create reference of interface and an object with respect to class which implements the interface 
//By default all the methods public abstract in interface
interface cleaner{
	void clean();
}
interface writer{
	void write();
}
class pen implements writer{
	public void write() {
		System.out.println("pen");
 }
}
class pencil implements writer{
	public void write() {
		System.out.println(" In pencil");
	}	
}
class Eraser extends pen implements writer,cleaner{
	public void erase() {
		System.out.println("can erace");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("clean it");
	}
}
public  class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println();
		writer obj=new Eraser();
		obj.write();
	}
}

