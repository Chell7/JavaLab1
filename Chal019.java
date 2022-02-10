import java.util.Scanner;


public class Chal019 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please, enter 1,2,3:" );
		
		int number = input.nextInt(); //read the first name from the user
		
		if (number==1)
			System.out.println( "Thank you!");
		else if (number==2)
			System.out.println( "Well done!");
		else if (number==3)
			System.out.println( "Correct!");
		else
			System.out.println( "Error message!");

	}

}
