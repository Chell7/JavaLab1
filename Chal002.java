import java.util.Scanner;

public class Chal002 {
	public static void main( String[] args ) {

		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first name:" );
		String firstName = input.nextLine(); //read the first name from the user
		
		System.out.println( "Please, enter your last name:" );
		String lastName = input.nextLine(); //read the last name from the user
		
		System.out.println( "Your full name is "+ firstName + " " + lastName + ".");
		
	}
}
