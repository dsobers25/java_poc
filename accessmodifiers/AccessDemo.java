package accessmodifiers;

public class AccessDemo {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		/* Access to alpha is allowed only through its
		 * accessor methods.*/
		
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		// Your cannot access alpha like this:
		// ob.alpha = 10; // Wrong! alpha is private!
		// These are OK because beta and gamma are public
		ob.beta = 88;
		ob.gamma = 99;

	}

}
