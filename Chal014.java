import java.util.Scanner;


public class Chal014 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a number that is between 10 and 20 inclusive:" );
		int number = input.nextInt(); 
		
		if (10 <=number  & number <= 20)
			System.out.println( "Thank you!");
		else 
			System.out.println( "Incorrect answer!");

}

}