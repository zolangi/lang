import java.util.Scanner;

public class FunMathProg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("0: Exit, 1: Random Number Generator, 2: Find greatest common denominator, 3: Multiplication Practice");
			int user = input.nextInt();

			while (true) {
				if (user >= 0 && user <= 3)
					break;
				else {
					System.out.println("Try again.");
					user = input.nextInt();
				}
			}

			if (user == 0)
				return;

			if (user != 0) {
				while (true) {
					if (user == 1) {
						System.out.println("Enter two #'s: ");
						int rngu = input.nextInt();
						int rnguu = input.nextInt();
						int j = randomNum(rngu, rnguu);

						System.out.println("Your random #: " + j);

						System.out.println("Enter choice: continue(1), go back to the main menu(2), or exit(0)");
						int choice = input.nextInt();
						if (choice == 1)
							continue;
						else if (choice == 2)
							break;
						else if (choice == 0)
							return;
						else
							System.exit(user);
					}

					if (user == 2) {
						System.out.println("Enter two #'s: ");
						int diviu = input.nextInt();
						int diviuu = input.nextInt();
						int v = gcD(diviu, diviuu);

						System.out.println("The GCD is:  " + v);

						System.out.println("Enter choice: continue(1), go back to the main menu(2), or exit(0)");
						int choice = input.nextInt();
						if (choice == 1)
							continue;
						else if (choice == 2)
							break;
						else if (choice == 0)
							return;
						else
							System.exit(user);
					}

					if (user == 3) {
						int number1 = (int) (Math.random() * 13);
						int number2 = (int) (Math.random() * 13);

						System.out.println("Find the product of the two random #'s "+ number1 + " x " + number2);
						int useranswer = input.nextInt();

						if (useranswer == number1 * number2) {
							System.out.println("CORRECT!");
						} else {
							System.out.println("WRONG! Try again.");
						}

						System.out.println("Enter choice: continue(1), go back to the main menu(2), or exit(0)");
						int choice = input.nextInt();
						if (choice == 1)
							continue;
						else if (choice == 2)
							break;
						else if (choice == 0)
							return;
						else
							System.exit(user);
					}
				}
			}
		}
	}

	public static int randomNum(int rng1, int rng2) {
		int temp;
		if (rng2 > rng1) {
			temp = rng1;
			rng1 = rng2;
			rng2 = temp;
		}
		int range = rng1 - rng2;

		int tot = rng2 + (int) (Math.random() * range + 1);

		return tot;
	}

	public static int gcD(int divi1, int divi2) {
		int gcd = 1;
		int k = 2;

		while (k <= divi1 && k <= divi2) {
			if (divi1 % k == 0 && divi2 % k == 0) {
				gcd = k;
			}
			k++;
		}

		return gcd;
	}

}