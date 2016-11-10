import java.util.Scanner;

public class Height{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your height: ");

		double inches = input.nextDouble();

		double centimeters = inches * 2.54;

		System.out.println("Height in cm "+ centimeters);
	}
}
