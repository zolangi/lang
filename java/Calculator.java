import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter two numbers with a space in between: ");
		int user = myScanner.nextInt();
		int user2 = myScanner.nextInt();

		System.out.println(" Add = 1, Subtract = 2, Multiply = 3, Divide = 4");
		System.out.println("Input a number from 1-4");

		int calc = myScanner.nextInt();


		double result = 0;

		

		String operation = "";
		
		switch (calc) {

		case 1:
			operation = " + ";
			result = user + user2;
			break;
		case 2:
			operation = " - ";
			result = user - user2;
			break;
		case 3:
			operation = " x ";
			result = user * user2;
			break;
		case 4:
			operation = " / ";
			result = ((double)user / user2);
			break;

			

		default:
			System.out.println("Error: invalid status");
		}
		System.out.println("The result of " + user + operation + user2 + " is " + result);
	}
}
