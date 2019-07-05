package passingbyref;

public class PassObRef {

	public static void main(String[] args) {
		Test ob = new Test(15, 20);
		// this assignment points ob2 to the same memory location as ob
		Test ob2 = ob;
		// ob and ob2 share the same memory location therefore they share the same variable values
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		System.out.println("ob2.a and ob2.b before cal: " + ob2.a + " " + ob2.b);
		// once a value is manipulated at a share memory location all objects connected to it
		// are modified
		ob.change(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
		System.out.println("ob2.a and ob2.b after call: " + ob2.a + " " + ob2.b);

	}

}
