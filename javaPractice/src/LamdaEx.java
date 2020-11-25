
interface animal {
	public void Animal();
}
//
// class dog implements animal {
// public void Animal() {
// System.out.println("barking");
// }
// }

public class LamdaEx {
	public static void main(String[] args) {

		animal a = ()-> {
			System.out.println("hi");
			System.out.println("mahi");
		};
		a.Animal();
	}

}
