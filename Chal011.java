import java.util.Scanner;

public class Chal011 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please, enter a number over 100:" );
		
		int number1 = input.nextInt(); 
		System.out.println( "Please, enter a number under 10:" );
		
		int number2 = input.nextInt(); 
		

		int division = number1/number2;
		


		
		System.out.println( number2 + " goes into"+ " " + number1 + " "+ division +" times.");

	}

}






//(Math.floorDiv(number1, number2));