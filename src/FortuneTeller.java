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

		if (ageNumber % 2 == 0) { // if ageNumber is evenly divisible by 2
			System.out.println(ageNumber + "is even");
			String yearsRetire1 = input.nextLine();
			System.out.println("You will retire in 12 years");
		} else {
			System.out.println(ageNumber + " is odd");
			String yearsRetire2 = input.nextLine();
			System.out.println("You will retire in 14 years");

			System.out.println("Enter your birth month");
			int birthMonth = input.nextInt();

		}
	}
}
