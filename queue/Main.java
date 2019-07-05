package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue test = new Queue(10);
		test.put('c');
		test.put('o');
		
		System.out.println(test.get());
		System.out.println(test.get());


	}

}
