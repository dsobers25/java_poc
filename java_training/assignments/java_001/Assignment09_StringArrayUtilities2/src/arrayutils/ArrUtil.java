package arrayutils;

public class ArrUtil {
	public static boolean arrayHasExactMatch(String[] arr, String str, boolean bin) {
		if (bin == false) {
			str.toLowerCase();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if (bin == false) {
				if (str.equals(arr[i].toLowerCase())) {
					return true;
				}
			}
			if (str.equals(arr[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static int indexOfOccuranceInArray(String[] arr, String str, boolean bin) {
		int occurances = 0;
		int[] foundIndexes = new int[1];
		if (bin == false) {
			str.toLowerCase();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if (bin == false) {
				if (str.equals(arr[i].toLowerCase())) {
					foundIndexes[0]++;
					occurances++;
				}
			}
			if (str.equals(arr[i])) {
				foundIndexes[0]++;
				occurances++;
			}
			
		}
		if(occurances == 0) {
			return -1;
		}
		
		return foundIndexes[0];
	}

}
