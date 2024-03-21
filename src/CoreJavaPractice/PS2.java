package CoreJavaPractice;

public class PS2 extends PS3{

	int a;
	String testString;

	public PS2(int a, String testString) {
		super(a);
		this.a = a;
		this.testString = testString;
	}

	public int increment() {
		a = a + 1;
		return a;
	}

	public int decrement() {
		a = a - 1;
		return a;
	}
}
