package java8;

public class TestingString{ 
    // Concatenates to String 
	public static void concat1(String s1) {
		s1 = s1 + "edurekablog";
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append("edurekablog");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append("edurekablog");
	}

	public static void main(String[] args) {
		String s1 = "Andvideos";
		concat1(s1); // s1 is not changed
		System.out.println("String: " + s1);
		StringBuilder s2 = new StringBuilder("Andvideos");
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);
		StringBuffer s3 = new StringBuffer("Andvideos");
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
	}
}
