import java.util.Scanner;


public class Chal006 {
	
	public static void main( String[] args ) {
		
	    Scanner input = new Scanner( System.in );
	    
		System.out.println( "How many slices of pizza have you started with?" );
		int numberSlicesS = input.nextInt(); 
		
		System.out.println( "How many slices of pizza have you eaten?");
		int numberSlicesE = input.nextInt(); 
		
		int numberSlicesL = numberSlicesS - numberSlicesE;
		
		System.out.println( "There are " + numberSlicesL + " slices left.");
		
	
	}
}
