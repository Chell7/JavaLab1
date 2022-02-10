import java.util.Scanner;

public class Chal007 {
	public static void main( String[] args ) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first name:" );
		String firstName = input.nextLine(); 
		
		System.out.println( "How old are you?" );
		int age = input.nextInt(); 
		
		int newage = age + 1;
		
		System.out.println( firstName +", next birthday you will be " + newage + ".");
	}
	
}
