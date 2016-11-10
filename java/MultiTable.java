import java.util.Scanner;


public class MultiTable {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 13);
		int number2 = (int) (Math.random() * 13);

		int answer = (number1 * number2);

		System.out.println("What is: " + number1 + " x " + number2 + "? ");

		Scanner myScanner = new Scanner(System.in);
		int userAnswer = myScanner.nextInt();

		if (userAnswer == number1 * number2){
			System.out.println("Correct!");
		} else if(userAnswer <= answer - 5 || userAnswer >= answer + 5) {
			System.out.println("Sorry, Try again.");
		} else if (userAnswer < 5 || userAnswer > 5){
			System.out.println("Close, but no cigar!");
		}
	}

}
