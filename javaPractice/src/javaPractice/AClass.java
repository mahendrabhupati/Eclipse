package javaPractice;

public class AClass {
	private int r;
	
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public AClass() {
		System.out.println("In constructor A");
	}
	public AClass(int i) {
		System.out.println("In constructor A integer");
	}
}

