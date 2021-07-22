package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Java8Examples {

	public static void main(String[] args) {

		// Default Methods for Interfaces
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		formula.calculate(100); // 100.0
		formula.sqrt(16); // 4.0

		List<String> names = Arrays.asList("Samarpit", "Aayush", "Harsh", "Likhith");
		// Collections.sort(names, (String a,String b)->{})
		names.sort((String a, String b) -> b.compareTo(a));
		for (String name : names)
			System.out.println("" + name);

		// Functional Interface
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);

		// Method and Constructor References
		// utilizing static method references
		Converter<String, Integer> converter2 = Integer::valueOf;
		Integer converted2 = converter2.convert("345");
		System.out.println(converted2);

		// reference object methods
		Something something = new Something();
		Converter<String, String> converter3 = something::startsWith;
		String converted3 = converter3.convert("Java Developer");
		System.out.println(converted3);

		// Constructor Reference
		// Instead of implementing the factory manually, we can tied everything together
		// via constructor references
		PersonFactory<Person> personFactory = Person::new;
		personFactory.created("Samarpit", "Gupta");

		// Lambda Scopes
		final int num = 1;
		Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		stringConverter.convert(2);
		System.out.println(stringConverter.convert(2));
		int num2 = 2;
		Converter<Integer, String> stringConverter2 = (from) -> String.valueOf(from + num2); // num must be implicitly
																								// final
		// num2=8;
		stringConverter2.convert(2);
		System.out.println(stringConverter2.convert(2));

		// Accessing Default Interface Methods
		// Formula formula = (a) -> sqrt(a * 100);

		// Built-in Functional Interfaces
		// Predicates
		// boolean-valued functions of one argument

		// More Prac - https://mkyong.com/java8/java-8-predicate-examples/
		Predicate<String> predicate = (s) -> s.length() > 0;

		predicate.test("foo"); // true
		predicate.negate().test("foo"); // false
		System.out.println("-------------Predicates----------------");
		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		System.out.println(nonNull.negate());
		System.out.println(isNull.test(null));
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		System.out.println(isEmpty);
		System.out.println(isNotEmpty);

		System.out.println("-------------Predicates-2----------------");
		Predicate<Integer> pr = a -> (a > 8);// Creating predicate
		System.out.println(pr.test(10)); // Calling Predicate method
		Predicate<Integer> pred = Java8Examples::checkAge;
		boolean result = pred.test(24);
		System.out.println(result);
		
		//

	}

	static Boolean checkAge(int age) {
		if (age > 17)
			return true;
		else
			return false;
	}

}

interface Formula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}

@FunctionalInterface
interface Converter<F, T> {
	T convert(F from);
}

class Something {
	String startsWith(String s) {
		return String.valueOf(s.charAt(0));
	}
}

class Person {
	String firstName;
	String lastName;

	Person() {
	}

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

interface PersonFactory<P extends Person> {
	P created(String fName, String lName);
}

// Accessing fields and static variables
// In contrast to local variables, we have both read and write access to
// instance fields and static variables from within lambda expressions. This
// behaviour is well known from anonymous objects.
class Lambda4 {
	static int outerStaticNum;
	int outerNum;

	void testScopes() {
		Converter<Integer, String> stringConverter1 = (from) -> {
			outerNum = 23;
			return String.valueOf(from);
		};

		Converter<Integer, String> stringConverter2 = (from) -> {
			outerStaticNum = 72;
			return String.valueOf(from);
		};
	}
}
