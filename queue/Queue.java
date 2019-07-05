package queue;

public class Queue {
	
	// class Queue demonstrating private properties members
	private char q[];
	private int putloc, getloc;
	
	// constructor
	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	// Put a character into the queue
	void put(char ch) {
		// if true then no more characters can be added to array
		// you have reached the end of the array
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		// if false array index is assigned and then incremented by one 
		q[putloc++] = ch;
	}
	
	// Get a character from the queue
	char get() {
		// if true then their values are still 0 and 0
		// which means they are empty
		if(getloc == putloc) {
			System.out.println(" -- Queue is empty.");
			return (char) 0;
		}
		// if false then the value at the array index is returned and getloc is incremented by one
		return q[getloc++];
	}

}
