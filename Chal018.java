import java.util.Scanner;

public class Chal018 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a number:" );
		int number = input.nextInt(); //read a number from the user
		
		if (number< 10)
			System.out.println( "Too low!");
		else if (10 < number & number < 20)
			System.out.println( "Correct!");
		else
			System.out.println( "Too high!");
	}
}
