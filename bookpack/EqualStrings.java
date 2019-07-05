package bookpack;

public class EqualStrings {
	public static void main(String[] args) {
		String a = "Hey";
		String b = "Hey";
		
		if(a.equals(b)) {
			System.out.print("They are equal (" + a + " = " + b + ")");
		} else {
			System.out.print("They are not equal (" + a + " != " + b + ")");
		}
	}
}
