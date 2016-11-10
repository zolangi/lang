import java.util.Scanner;

public class NameChecker {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out
				.println("Enter your first & last name with a space in between: ");

		String first = myScanner.next();
		String last = myScanner.next();

		first.charAt(0);
		last.charAt(0);

		if (('A' <= first.charAt(0) && first.charAt(0) <= 'Z')
				&& ('A' <= last.charAt(0) && last.charAt(0) <= 'Z')) {
			if (last.charAt(0) > 'M') {
				System.out
						.println("You have an extra half minute to get to class before your name is called.");
			} else {
				System.out.println("You better get to class on time!");
			}
		} else {
			System.out.println("You need to capitalize your name.");
		}

	}

}