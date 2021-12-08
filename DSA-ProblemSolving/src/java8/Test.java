package java8;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.process(5);
	}

}

class A {
	public void process(int i) {
		i = i + 1;
		System.out.println("i before: " + i);
		processB(i);
		System.out.println("i after: " + i);
	}

	public void processB(int i) {
		i = i + 2;
		System.out.println(i);
	}
}
