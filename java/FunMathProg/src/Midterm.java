import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String userName = null;
		String password = null;
		
		while (true) {
			System.out.println("1. Sign in, 2. Register, 0. Exit");
			int user = input.nextInt();

			while (true) {
				if (user >= 0 && user <= 2)
					break;
				else {
					System.out.println("Try again.");
					user = input.nextInt();
				}
			}

			if (user == 0)
				return;

			if (user != 0) {
				switch (user) {
				case 0:
					break;
				case 1:
					int choi2;
					do {
						System.out.println("Enter Username: ");
						String uN = input.next();
						System.out.println("Enter Password: ");
						String pS = input.next();
						System.out.println(userName);

						String uNs = uN;
						String uPs = pS;
						
						if(userName == null || password == null){
							System.out.println("You should try registering.");
						break;
						}
						
						while (uNs.equals(userName) && uPs.equals(password)) {
							System.out.println("Enter a choice: (1) Times practice , (0) Exit.");
							int choi3 = input.nextInt();
							if (choi3 == 0)
								return;
							if (choi3 == 1) {
								int number1 = (int) (Math.random() * 13);
								int number2 = (int) (Math.random() * 13);
								System.out.println("Find the product of the two random #'s " + number1 + " x " + number2);
								int useranswer = input.nextInt();

								if (useranswer == number1 * number2)
									System.out.println("CORRECT!");
								else
									System.out.println("WRONG! Try again.");
							}
		 				}

						if (!uNs.equals(userName) || !uPs.equals(password))
							System.out.println("Incorrct Username/Incorrect Password. Try again.");
	
						System.out.println("Enter choice:  Exit(0) OR Main Menu (3)");
						choi2 = input.nextInt();
						if (choi2 == 3)
							break;
						else if (choi2 == 0)
							return;
						else
							System.exit(user);

					} while (choi2 == 1);
					break;
				case 2:
					int choi;
					do {
						System.out.println("You are choosing to Register");
						System.out.println("Enter a Username: ");
						String uN1 = input.next();
						System.out.println("Enter a Password: ");
						String pS1 = input.next();
						userName = uN1;
						password = pS1;

						System.out.println("CONGRATS! You are now Registered. Your username: "
										+ userName + " Password: " + password);

						System.out.println("Enter choice:  Exit(0) OR Main Menu (3)");
						choi = input.nextInt();
						if (choi == 3)
							break;
						else if (choi == 0)
							return;
						else
							System.exit(user);
					} while (choi == 2);
					break;

				}
			}
		}
	}
}
