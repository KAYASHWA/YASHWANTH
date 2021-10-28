package assignment;

import java.util.Scanner;

public class CubeCalculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scan.nextInt();
		scan.close();
		int cube = CalculateCube(number*number*number);
		System.out.println("Cube of " + number + " is " + cube);
	}

	private static int CalculateCube(int number) {
		
		return ( number);
	}

	
}
