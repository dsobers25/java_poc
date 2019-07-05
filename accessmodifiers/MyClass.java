package accessmodifiers;

public class MyClass {
	private int alpha; // private access
	public int beta; // public access
	int gamma; // default access
	
	/* Methods to access alpha. It is OK for
	a member of a class to access a private member
	of the same class. */
	
	void setAlpha(int a) {
		if(a == 0) {
			alpha = 1;
		} else {
			alpha = a;
		}
	}
	
	int getAlpha() {
		return alpha;
	}

}
