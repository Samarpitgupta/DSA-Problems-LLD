package bitwise;

public class BitwiseMain {

	public static void main(String args[]) {

		int x = 3, y = 6;
		System.out.println(x & y); // AND
		System.out.println(x | y); // OR
		System.out.println(x ^ y); // XOR
		System.out.println(~x); // invert

		// in java, negative numbers are stored in 2's complement representation
		// representation of -x = 2 pow(32) -x
		// Range of int : -2Pow(31) to 2pow(31)-1 or -2147483648 to 2,147,483647
		x = 5;
		System.out.println(~x); // 2pow(32)-1-5=2(pow32)-6 = -6

		// Left shift operator // binary operator
		y = 4;
		System.out.println(x << y); // left shift
		x = -1;
		System.out.println(x << 1);

		// Right shift
		x = 33;
		System.out.println(x >> 2);

		x = -2;
		System.out.println(x >> 2);
		
		// Unsigned Right shift >>>
		// negative number become positive
		x = -2;
		System.out.println(x >>> 2);
	}
}
