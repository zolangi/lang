import java.util.Scanner;

public class ConnectFour {
	static String[][] jo = patternat();
	public static void main(String[] args) {
		boolean winOrLose= true;
		int whoseTurn=0;
		while(winOrLose){
			if( whoseTurn % 2 == 0)
				yellowPat();
			else
				redPatter();
			
			whoseTurn++;
			
			printBoard();
			
			if(whoWon(jo) != null){
				if(whoWon(jo) == "R "){
					System.out.println("RED WINS!!!");
					break;
					}
				else if (whoWon(jo) == "Y "){
					System.out.println("YELLOW WINS!!!!");
					break;
					}
				}
		}
	}
		
	public static String[][] patternat(){
		String [][] job = new String [7][15];
		for (int i = 0; i<job.length; i++){
			for (int k = 0; k<job[i].length; k++){
				if (k%2 == 0)job[i][k]= " |  ";
				else job[i][k]="  ";
				if (i == 6 )job[i][k] = " _ ";
			}
		}
		return job;
	}
	
	public static String[][] printBoard(){
		
		for (int i=0; i<jo.length; i++){
			for(int k = 0; k<jo[i].length; k++){
				System.out.print(jo[i][k]);
			}
			System.out.println();
		}
		return jo;
	}
	
	public static void yellowPat(){
		System.out.println("Drop Yellow chip at column (0-6): ");
		Scanner input = new Scanner(System.in);
		//each chip has to fall into an 'index' of 1,3,5,7,9,11,13
		//the 2,4,6,8,10,12,14 'indexes' are the |
		int w = 2*input.nextInt() + 1;
		for(int i = 5; i >= 0; i--){
			if (jo[i][w]== "  "){
				jo[i][w] = "Y ";
				break;
			}
		}	
	}
	
	public static void redPatter(){
		System.out.println("Drop Red chip at column (0-6): ");
		Scanner input = new Scanner(System.in);
		//each chip has to fall into an 'index' of 1,3,5,7,9,11,13
		//the 0,2,4,6,8,10,12, 14 'indexes' are the |
		int w = 2*input.nextInt() + 1 ;
		for(int i = 5; i >= 0 ; i--){
			if(jo[i][w] == "  "){
				jo[i][w]= "R ";
				break;
			}
		}
	}
	
	public static String whoWon(String[][] sob){
		//winning horizontally
		for (int i=0; i<6;i++){
			for(int p = 0;p < 7 ; p += 2 ){
				if (sob[i][p+1] != "  "
					&& sob[i][p+3] != "  "
					&& sob[i][p+5] != "  "
					&& sob[i][p+7] != "  "
					&& sob[i][p+1] == sob[i][p+3]
					&& sob[i][p+3] == sob[i][p+5]
					&& sob[i][p+5] == sob[i][p+7])
					return sob[i][p+1];
			}
		}
		//winning vertically
		for (int i = 0; i < 6; i++){
			for (int ppp = 1; ppp < 6; ppp += 2){
				int k = i + 3;
				if (k >= 7){
					break;
				}
				if(sob[i][ppp] != "  "
					&& sob[i+1][ppp] != "  "
					&& sob[i+2][ppp] != "  "
					&& sob[i+3][ppp] != "  "
					&& sob[i][ppp] == sob[i+1][ppp]
					&& sob[i+1][ppp] == sob[i+2][ppp]
					&& sob[i+2][ppp] == sob[i+3][ppp]){
					return sob[i][ppp];
				}
			}
		}
	//DESCENDING diagonally
		for(int i = 0; i < 3; i++){
			for(int rilef = 7; rilef < 15; rilef+=2){
				int k = i + 5;
				if (k >=9){
					break;
				}
				if (sob[i][rilef] != "  "
					&& sob[i+1][rilef-2] != "  "
					&& sob[i+2][rilef-4] != "  "
					&& sob[i+3][rilef-6] != "  "
					&& sob[i][rilef] == sob[i+1][rilef-2]
					&& sob[i+1][rilef-2] == sob[i+2][rilef -4]
					&& sob[i+2][rilef-4] == sob[i+3][rilef -6])
					return sob[i][rilef];
			}
		}
		//ASCENDING diagonally
		for(int i = 0; i < 3; i++){
			for(int le = 1; le < 9; le+=2){
				int k = i + 5;
				if(k>=9){
					break;
				}
				if (sob[i][le] != "  "
					&& sob[i+1][le+2] != "  "
					&& sob[i+2][le+4] != "  "
					&& sob[i+3][le+6] != "  " 
					&& sob[i][le] == sob[i+1][le + 2]
					&& sob[i+1][le+2] == sob[i+2][le + 4]
					&& sob[i+2][le+4] == sob[i+3][le + 6] )
					return sob[i][le];
			}
		}
		return null;
	}
}
