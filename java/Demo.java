package cs3035;

public class Demo {

	public static void main(String[] args) {

/*		LOOPING A TRIANGLE
 * 		for(int i=0; i<8; i++){
			for(int j = 0; j<i; j++){
			System.out.print("#");
			}
			System.out.println();
		}*/
		
	/*	//FIZZBUZZ
		int i =0;
		while(i<=100){
			if((i%5==0) && (i%3==0) && (i%4==0) && (i%6 ==0))
				System.out.println("FIZZ BUZZ CRACKLE POP");
			else if((i%5 == 0) && (i%3 == 0))
				System.out.println("FIZZ BUZZ" );
			else if(i%3==0)
				System.out.println("FIZZ");
			else if(i%5==0 && (!(i%3==0)))
				System.out.println("BUZZ");
			else if((i%4 == 0) && (i%6==0))
				System.out.println("CRACKLE POP");
			else if(i%4==0)
				System.out.println("CRACKLE");
			else if(i%6 == 0)
				System.out.println("POP");
				
			else System.out.println(i);
			i++;
		}*/
	/*	//JavaScript Code
		var i =0;
		while(i<=100){
			if((i%5==0) && (i%3==0) && (i%4==0) && (i%6 ==0))
				console.log("FIZZ BUZZ CRACKLE POP");
			else if((i%5 == 0) && (i%3 == 0))
				console.log("FIZZ BUZZ" );
			else if(i%3==0)
				console.log("FIZZ");
			else if(i%5==0 && (!(i%3==0)))
				console.log("BUZZ");
			else if((i%4 == 0) && (i%6==0))
				console.log("CRACKLE POP");
			else if(i%4==0)
				console.log("CRACKLE");
			else if(i%6 == 0)
				console.log("POP");
				
			else console.log(i);
			i++;
		}*/
		
		int randomNum = (int) (Math.random() * 12) + 1;
		System.out.println(randomNum);
		
	}

}
