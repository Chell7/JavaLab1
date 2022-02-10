import java.util.Scanner;


public class Chal005 {
	
	public static void main( String[] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please, enter your first number:" );
		
		int number1 = input.nextInt(); //read the first number from the user
		System.out.println( "Please, enter your second number:" );
		
		int number2 = input.nextInt(); //read the second number from the user
		System.out.println( "Please, enter your third number:" );
		
		int number3 = input.nextInt(); //read the third from the user
		
		int total = (number1 + number2) * number3;
		
		System.out.println( "The answer is "+ total + ".");
	}
}
