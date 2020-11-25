package javaPractice;


public class B extends AClass{
	private int x,y;
	float i;
	public B() {
		super();
		System.out.println("In constructor B");
		
	}
	public B(int i) {
		super(i);
		System.out.println("In constructor B integer");
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
