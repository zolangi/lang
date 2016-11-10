
public class Final {
	static String[][] mMatrix = pattern();
	public static void main(String[] args) {
		printMatrix();
		System.out.println();
		firstPatt();
		printMatrix();
		System.out.println();
		secondPatt();
		printMatrix();
		System.out.println();
		thirdPatt();
		printMatrix();
		System.out.println();
		fourthPatt();
		printMatrix();

	}

	public static String[][] pattern(){
		String [][] matrix = new String [10][10];
		for(int i =0; i < matrix.length; i++){
			for(int j = 0; j< matrix[i].length; j++){
				System.out.printf(".");
			}
			System.out.println();
		}
		return matrix;
	}

	public static String[][] printMatrix(){
		for (int i=0; i<mMatrix.length; i++){
			for(int j = 0; j==mMatrix[i].length; j++){
				System.out.print(mMatrix[i][j]);
			}
			System.out.println();
		}
		return mMatrix;
	}

	public static void firstPatt(){
		for(int i = 10; i>0 ; i--){
			System.out.print(i);
				 System.out.print(".");
			 
		}
	}


	public static void secondPatt(){
		for(int i = 0; i< mMatrix.length; i++){
			for(int j = 0; j> 0; j++){
				if (mMatrix[i][j+1]== "."
						&& mMatrix[i][j+1]=="."){
					mMatrix[i][j] += 4; 
					System.out.print(mMatrix[i][j]);
				}
			}
		}
	}
	public static void thirdPatt(){
		for(int i = 0; i< mMatrix.length; i++){

			for(int j = 0; j> 0; j++){
				if (mMatrix[i][j+1]== "."
						&& mMatrix[i][j+1]=="."){
					mMatrix[j][i] += 4; 
					System.out.print(mMatrix[i][j]);
				}
				
			}

		}
	}
	public static void fourthPatt(){
		for(int i = 0; i< mMatrix.length; i++){
			for(int j = 10; j> 0; j--){

				if (mMatrix[i][j-1]== "."
						&& mMatrix[i][j-1]=="."){
					mMatrix[j][i] += 4; 
					System.out.print(mMatrix[i][j-1]);
				}
			}
		}
	}

}
