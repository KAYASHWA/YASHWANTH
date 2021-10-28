package lab9;

import java.util.Scanner;

public class AgeException {
	public static void main(String[] args) throws Exception {

		checkAge();// method for checking age
	}

	
	public static void checkAge() {

	    Scanner sc = new Scanner(System.in);
		System.out.println(" game is designed for 15 ");
		System.out.println("Enter valid age to login game: ");
		int age = sc.nextInt();

		
		try {
			if (age <= 0) {
				throw new InvalidNumberException();
			} else if (age < 15) {
				throw new InvalidAgeException("game is for 15+, you cannot login the game");
			} else {
				System.out.println("You can play the game ");
			}

		} catch (InvalidAgeException iage) {

			System.out.println("You are resticted to login the game");

		} catch (InvalidNumberException in) {
			System.out.println("Please input age greater than 0");
		}

	}
}



