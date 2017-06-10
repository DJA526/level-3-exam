import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hmap1, HashMap<String, String> hmap2) {
		int commonPairs = 0;
		for (String name : hmap1.keySet()) {
			if (hmap2.containsKey(name)) {
				if (hmap1.get(name).equals(hmap2.get(name))) {
					commonPairs++;
				}
			}
		}
		return commonPairs;
	}

}
