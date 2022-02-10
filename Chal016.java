import java.util.Scanner;

public class Chal016 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Is it raining?");
		String rain = input.nextLine(); 
		rain = rain.toLowerCase();
		
		if (rain.equals("yes")) {
			System.out.println( "Is it windy?");
			String wind = input.nextLine(); 
			wind = wind.toLowerCase();
			if (wind.equals("yes"))
		    System.out.println( "It is too windy for an umbrella.");	
			else
			System.out.println( "Take an umbrella!");		
			
		    }
		else
			System.out.println( "Enjoy your day!");	
			
				
		

	}

}
