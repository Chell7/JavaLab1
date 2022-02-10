import java.util.Scanner;


public class Chal012 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first number:" );
		int number1 = input.nextInt(); 
		
		System.out.println( "Please, enter your second number:" );
		int number2 = input.nextInt(); 
		
		if (number1 > number2)
			System.out.println( "[ "+ number2+ " ]" + "[ "+ number1+ " ]" );
		else 
			System.out.println( "[ "+ number1+ " ]" + "[ "+ number2+ " ]" );
	}

}
