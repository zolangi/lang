import java.util.Scanner;


public class Bmi {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("What is your weight in lbs. and height in in.? ");
		
		int weight = myScanner.nextInt();
		int height = myScanner.nextInt();

		int bmi = (int) Math.round(703 * (double)weight/ Math.pow(height, 2));
		 
		System.out.println(Math.round(bmi));
		
	}

}
