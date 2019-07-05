package recursivepack;

public class factorial {
	
	int fact(int x) {
		if(x <= 1) {
			return 1;
		}
		// calls itself until x <= 1
		int result = fact(x - 1) * x;
		// result = x * (x-1)... * 1
		return result;
	}
	
	public static void main(String[] args) {
		factorial f = new factorial();
		// 4 * 3 * 2 * 1 = 24
		System.out.print(f.fact(4));
		
	}

}
