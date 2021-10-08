package gfg100days.challenge.day1to10;

public class ExactlyRepeated {

	public static void main(String args[]) {

	}

	// Check if a string can be repeated to make another string
	public int repeatedStringMatch(String a, String b) {
		if ((b.length() % a.length()) != 0)
			return -1;
		int count = b.length() / a.length();
		String str = "";
		for (int i = 0; i < count; i++)
			str = str + a;
		if (str.contains(b))
			return count;
		return -1;
	}
}
