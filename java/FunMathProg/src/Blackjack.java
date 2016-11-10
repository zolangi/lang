import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args){ 
		int[] deck = new int[52];

		for(int i = 0; i < deck.length; i++)
			deck[i] = i;
		boolean match = true;

		while(match){
			shuffle(deck);
			int userHa = 2;
			int t = 51;
			house(deck, t);

			userHand(deck, userHa );

			boolean uuu = true;
			while(uuu){
				int result = 0;
				for (int i = 0; i < userHa; i++){

					if(deck[i] % 13 == 0){
						result = result + 11;
					}
					else if (deck[i] % 13 <= 12 && deck[i]%13 >= 10){
						result = result + 10;
					}
					else {
						int vali = (deck[i] %13) + 1;

						result = result + vali;
					}
				}
				//check if in total with the new card = 21 for win
				if (result == 21){
					System.out.println("You Win!" + result);
					uuu=false;
					break;
				}
				//check if the new card added to the set of cards is greater than 21 for loss
				if (result > 21){
					System.out.println("You lost: " + result);
					uuu= false;
					break;
				}
				//check if the new card with the total of the last two are less than 21 to ask to hit again



				//Ask the user if she wants to hit or stand
				System.out.println("Enter choice: Hit(1), Stand(2), exit(0)");
				Scanner input = new Scanner(System.in);
				int choice = input.nextInt();
				if (choice == 1)
					userHand(deck, ++userHa);

				else if (choice == 2){
					t=t -1;
					System.out.println("The House's hand: ");
					house(deck, t);
					int hresult = 0;
					boolean hhh = true;
					while(hhh){
						hresult = 0;
						for (int i= t; i <= 51; i++){

							if (deck[i] % 13 == 0){
								hresult = hresult + 11;
							} 
							else if (deck[i] % 13 <= 12 && deck[i]% 13 >=10)
								hresult = hresult + 10;
							else{
								int valk = (deck[i] % 13) + 1;
								hresult = hresult + valk;
							}
							
						}
						if (hresult < 17){
							t=t-1;
							System.out.println( "House's hand after drawing: ");
							house(deck, t);

						}
						else{
							house(deck, t);
							hhh = false;
							break;
						}
					}
					if (hresult > 21){
						System.out.println("House BUSTED. You win");
						uuu = false;
					}
					else if(result > hresult){
						System.out.println("You win!");
						uuu= false;
					}
					else if(hresult > result){
						System.out.println("House wins.");
						uuu = false;
					}
					else if(hresult == result){
						System.out.println("IT'S A TIE!!");
						uuu = false;
					}
				}
				else if (choice == 0)
					return;
				else
					System.exit(0);
			}
			System.out.println("Play Again? : 1:Y 2:EXIT");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();

			if(choice == 2)
				match = false;

		}

	}
	public static void shuffle(int[] shuff) {
		// initialize cards
		for (int i = 0; i < shuff.length; i++)
			shuff[i] = i;
		// shuffle cards
		for (int i = 0; i < shuff.length; i++) {
			// generate index randomly
			int index = (int) (Math.random() * shuff.length);
			int temp = shuff[i];
			shuff[i] = shuff[index];
			shuff[index] = temp;
		}
	}

	public static void house(int[] hcard, int i) {
		// Display the 1st card of the house
		for (int a = i; a <= 51; a++) {
			String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
			String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
					"10", "J", "Q", "K" };
			String suit = suits[hcard[a] / 13];
			String rank = ranks[hcard[a] % 13];
			String houseCard = "House card : " + rank + " of " + suit + "\n";
			System.out.println(houseCard);
			// return houseCard;
		}
	}

	public static void userHand(int[] uh, int i) {
		// Display the 1st 2 cards of the user
		for (int a = 0; a < i; a++) {
			String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
			String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
					"10", "J", "Q", "K" };
			String suit = suits[uh[a] / 13];
			String rank = ranks[uh[a] % 13];
			System.out.println("Your card : " + rank + " of " + suit);
		}
	}

}
