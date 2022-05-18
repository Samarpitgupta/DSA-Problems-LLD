import java.util.List;

public class TestMain {

	public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
		if (pairs.size() == 1 || pairs.size() == 0)
			return s;
		for (int i = 0; i < pairs.size(); i++) {
			s = swap(s, pairs.get(i).get(0), pairs.get(i).get(1));
		}
		return s;

	}

	private String swap(String str, int i, int j) {
		char temp;
		String newStr=str;
		return str;
	}

}
