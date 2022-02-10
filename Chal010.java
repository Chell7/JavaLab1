import java.util.Scanner;

public class Chal010 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a weight in kilograms to convert in pounds:" );
		double weight = input.nextDouble(); 
		
		double pounds = weight * 2.204;
		
		System.out.println( "That is " + pounds +" pounds.");
	}
}
