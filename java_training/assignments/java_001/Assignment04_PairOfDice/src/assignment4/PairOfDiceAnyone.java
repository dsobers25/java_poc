package assignment4;

import java.util.Scanner;

public class PairOfDiceAnyone {

	public static void main(String[] args) {
		// created a Scanner object to be able to accept input
		Scanner sc = new Scanner(System.in);
		// created a boolean variable and set it equal to true
		boolean play = true;
		// created a null String variable named quit
		String quit = null;
		// created a null String variable named playAgain
		String playAgain = null;
		// created a null integer variable named die1 and die2
		int die1 = 0;
		int die2 = 0;
		
		// while play is true the loop will continue iteration
		while(play) {
			System.out.println("Press any key to throw a die and press Enter (or Q and Enter to quit)");
			// quit is assigned to the users input
			quit = sc.next();
			// change the string value to all uppercase
			quit.toUpperCase();
			// the if statement checks if the first character is a capital 'Q' or the string assigned to
			// the word "quit"
			if(quit.charAt(0) == 'Q'|| quit.equals("quit")) {
				// assigns play the value of false to end loop
				play = false;
			} else {
				// assigns a random number to roll between 1 and 6
				die1 = (int) (Math.random() *6) + 1;
				die2 = (int) (Math.random() *6) + 1;
				// prints the random number selected to the console in a statement
				System.out.println("You have rolled a the following: ");
				System.out.printf("First Die: %d\n", die1);
				System.out.printf("Second Die: %d\n", die2);
				System.out.println("Play Again? (Y or y) and Enter, any other key and Enter to Quit");
				// assigns playAgain to the user input
				playAgain = sc.next();
				// the if statement checks if the first character is a capital or lowercase 'y'
				if(playAgain.charAt(0) == 'y' || playAgain.charAt(0) == 'Y') {
					// assigns play the value of false to end loop
					play = true;
				} else {
					// assigns play the value of false to end loop
					play = false;
				}// End of else
			}// End of else
		}// End of while
	}// End of main
}// End of class

