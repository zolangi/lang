import java.util.Scanner;


public class Craps {
	public static void main(String[] args) {
		while(true) {
			int j = roll();
			if  (j == 2 || j == 3 || j == 12)
				System.out.println("\n BOO!! You lose!");
			else if(j == 7 || j == 11)
				System.out.println("\n YOU WIN!!");
			else
				keepRoll(j);

        	System.out.println("Enter choice: continue(1), exit(0)");
        	Scanner input = new Scanner(System.in);

			int choice = input.nextInt();
			if (choice == 1)
				continue;
			else if (choice == 0)
				return;
			else
				System.exit(0);
        	}
        }

public static int roll(){
	int die1 = (int)(Math.random()*6) + 1;
    int die2 = (int)(Math.random()*6) + 1;
	int tot = die1 + die2;
	System.out.println("You rolled : " + die1 +" + "+ die2);
	System.out.println("Total is: " + tot);
	return tot;
}
public static void keepRoll(int tot){
	while(true){
		int reroll = roll();
		if(reroll == 7){
			System.out.println("You lose!!!");
		break;
		}
		else if (reroll == tot){
			System.out.println("\n YOU WIN!!");
		break;
		}
		System.out.println("Roll Again?: continue(1) OR exit(0)");
    	Scanner input = new Scanner(System.in);

		int choice = input.nextInt();
		if (choice == 1)
			continue;
		else if (choice == 0)
			return;
		else
			System.exit(0);
	}

}


}
