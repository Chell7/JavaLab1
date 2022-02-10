import java.util.Scanner;

public class Chal013 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a number that is under 20:" );
		int number = input.nextInt(); 
		
		if (number >= 20)
			System.out.println( "Too high!");
		else 
			System.out.println( "Thank you!");
	}

}
