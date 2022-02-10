import java.util.Scanner; // program uses Scanner


public class Chal001 {
	
	public static void main( String[] args ) {

	Scanner input = new Scanner( System.in );
	
	System.out.println( "Please, enter your first name:" );
	String firstName = input.nextLine(); //read the first name from the user
	
	System.out.println( "Your first name is "+ firstName +".");
	
}
}
