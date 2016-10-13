package whichAreIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {

	public static String[] whichAreIn(String[] a1, String[] a2){
		List<String> result = new ArrayList<>();
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a2[j].contains(a1[i]) && !result.contains(a1[i])){
					result.add(a1[i]);
					continue;
				}
			}
		}
		result.sort(null);
		return result.toArray(new String[result.size()]);
	}
	
	public static void main(String[] args) {
		String[] a1 = new String[]{"arp", "live", "strong"};
		String[] a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
		System.out.println(Arrays.toString(WhichAreIn.whichAreIn(a1, a2)));
		a1 = new String[]{"tarp", "mice", "bull"};
		a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
		System.out.println(Arrays.toString(WhichAreIn.whichAreIn(a1, a2)));
	}
}
