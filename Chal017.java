import java.util.Scanner;

public class Chal017 {

	public static void main(String[] args) {
	
    Scanner input = new Scanner( System.in );
		
		System.out.println( "How old are you?");
		int age = input.nextInt(); 
		
		if ( age>= 18) 
			System.out.println( "You can vote.");
	    else if (age==17)
		    System.out.println( "You can learn how to drive.");
		else if (age==16)
			System.out.println( "You can buy a lottery ticket.");
		else if (age <16)
			System.out.println( "You can go Trick-or-Treating.");
	}

}
