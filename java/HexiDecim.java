import java.util.Scanner;

public class HexiDecim {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a 4-digit Hexadecimal #: ");

		String hexString = myScanner.nextLine();

		char ch0 = hexString.charAt(0);
		char ch1 = hexString.charAt(1);
		char ch2 = hexString.charAt(2);
		char ch3 = hexString.charAt(3);

		int uval0 = 0;
		int uval1 = 0;
		int uval2 = 0;
		int uval3 = 0;

		if ('F' == ch0 || 'E' == ch0 || 'D' == ch0 || 'C' == ch0 || 'B' == ch0
				|| 'A' == ch0) {
			int value = ch0 - 'A' + 10;
			System.out.println("Decimal # is: " + ch0 + " is " + value);
			uval0 = (int) Math.pow(16, 3) * value;
		} else if (Character.isDigit(ch0)) {
			System.out.println("Decimal # is: " + ch0 + " is " + ch0);
			uval0 = (int) Math.pow(16, 3) * (ch0 - 48);
		} else {
			System.out.println("Invalid input");
		}

		if ('F' == ch1 || 'E' == ch1 || 'D' == ch1 || 'C' == ch1 || 'B' == ch1
				|| 'A' == ch1) {
			int value = ch1 - 'A' + 10;
			System.out.println("Decimal # is: " + ch1 + " is " + value);
			uval1 = (int) Math.pow(16, 2) * value;
		} else if (Character.isDigit(ch1)) {
			System.out.println("Decimal # is: " + ch1 + " is " + ch1);
			uval1 = (int) Math.pow(16, 2) * (ch1 - 48);
		} else {
			System.out.println("Invalid input");
		}

		if ('F' == ch2 || 'E' == ch2 || 'D' == ch2 || 'C' == ch2 || 'B' == ch2
				|| 'A' == ch2) {
			int value = ch2 - 'A' + 10;
			System.out.println("Decimal # is: " + ch2 + " is " + value);
			uval2 = (int) Math.pow(16, 1) * value;
		} else if (Character.isDigit(ch2)) {
			System.out.println("Decimal # is: " + ch2 + " is " + ch2);
			uval2 = (int) Math.pow(16, 1) * (ch2 - 48);
		} else {
			System.out.println("Invalid input");
		}

		if ('F' == ch3 || 'E' == ch3 || 'D' == ch3 || 'C' == ch3 || 'B' == ch3
				|| 'A' == ch3) {
			int value = ch3 - 'A' + 10;
			System.out.println("Decimal # is: " + ch3 + " is " + value);
			uval3 = (int) Math.pow(16, 0) * value;
		} else if (Character.isDigit(ch3)) {
			System.out.println("Decimal # is: " + ch3 + " is " + ch3);
			uval3 = (int) Math.pow(16, 0) * (ch3 - 48);
		} else {
			System.out.println("Invalid input");
		}

		System.out.println(uval0 + uval1 + uval2 + uval3);

	}

}
/*
-1. Incorrect output. Need to decrease the power by 1 for each digit. Your formula currently does:

    16^3 + 16^3 + 16^3 + 16^3

Needs to be:

    16^3 + 16^2 + 16^1 + 16^0

*/
