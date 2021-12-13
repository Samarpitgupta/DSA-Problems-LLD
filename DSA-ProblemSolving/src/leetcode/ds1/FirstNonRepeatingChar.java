package leetcode.ds1;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
	}

	public static int firstUniqChar(String s) {

		Map<Character, Integer> fMap = new HashMap<>();

		for (Character c : s.toCharArray()) {
			fMap.put(c, fMap.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (fMap.get(ch) == 1) {
				return i;
			}
		}
		return -1;
	}

}
