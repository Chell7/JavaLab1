import java.util.Scanner;

public class Chal015 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your favorite color:" );
		String color = input.nextLine(); 
		
		if (color.equals("red") || color.equals("Red") ||color.equals("RED"))
			System.out.println( "I like red too!");
		else 
			System.out.println( "I don't like " + color + ", I prefer red.");
	}

}
