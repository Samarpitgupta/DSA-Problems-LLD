package leetcode.ds1;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
	public boolean isAnagram(String s, String t) {

		Map<Character, Integer> fmap = new HashMap<>();

		for (Character ch : s.toCharArray()) {
			fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (fmap.containsKey(ch) == false)
				return false;
			else if (fmap.get(ch) == 1)
				fmap.remove(ch);
			else
				fmap.put(ch, fmap.get(ch) - 1);
		}
		return fmap.size() == 0;
	}
}
