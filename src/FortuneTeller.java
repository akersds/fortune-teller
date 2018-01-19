import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name");
		String firstName = input.next().trim();
		
		System.out.println("Enter your last name");
		String lastName = input.next().trim();
		
		System.out.println("Enter your favorite ROYGBIV color");
		String favoriteROYGBIV = input.next();
		
		System.out.println("Enter help for list of your favorite ROYGBIV color");
		String helpROYGBIV = input.next();
		
		System.out.println("Enter your number of siblings");
		int numberSiblings = input.nextInt();
		
		System.out.println("Enter your age");
		int ageNumber = input.nextInt();
		
		System.out.println("Enter your birth month");
		int birthMonth = input.nextInt();

		
		
		
		
		
		
		
		
		System.out.println(firstName + " " + lastName);

		if (firstName.length() > lastName.length()) {
			System.out.println(firstName + " is longer.");
		} else if (lastName.length() > firstName.length()) {
			System.out.println(lastName + " is longer.");
		} else {
			System.out.println("Both names are the same length.");
		}

		input.close();
	}

}
