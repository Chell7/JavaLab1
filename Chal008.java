import java.util.Scanner; // program uses Scanner

public class Chal008 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "What is the total price of the bill?" );
		int bill = input.nextInt(); 
		
		System.out.println( "How many dinners are there?" );
		int dinners = input.nextInt(); 
		
		int priceDinner= bill/ dinners;
		
		System.out.println( "Each dinner has to pay "+ priceDinner +" gourdes.");
		

	}

}
