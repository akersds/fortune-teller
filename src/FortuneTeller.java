import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name");
		String firstName = input.next().trim();

		System.out.println("Enter your last name");
		String lastName = input.next().trim();

		System.out.println("Enter your favorite ROYGBIV color");
		String transport; 
		String favoriteROYGBIV = input.next();
		if (favoriteROYGBIV.equalsIgnoreCase("red")) {
			transport = "Benz";
		} else if (favoriteROYGBIV.equalsIgnoreCase("orange")) {
			transport = "donkey";
		} else if (favoriteROYGBIV.equalsIgnoreCase("yellow")) {
			transport = "flying carpet";
		} else if (favoriteROYGBIV.equalsIgnoreCase("green")) {
			transport = "taxi";
		} else if (favoriteROYGBIV.equalsIgnoreCase("blue")) {
			transport = "roller skates";
		} else if (favoriteROYGBIV.equalsIgnoreCase("indigo")) {
			transport = "jeep";
		} else if (favoriteROYGBIV.equalsIgnoreCase("violet")) {
			transport = "Ford";

		}else {
			transport="goose";
		}
		System.out.println("Enter help for list of your favorite ROYGBIV color");
		String helpROYGBIV = input.next();

		System.out.println("Enter your number of siblings");
		int numberSiblings = input.nextInt();
		String vacationHome = "";
		if (numberSiblings == 0) {
			vacationHome = "Delhi, India.";

		} else if (numberSiblings == 1) {
			vacationHome = "Fiji Islands.";

		} else if (numberSiblings == 2) {
			vacationHome = "New York City.";

		} else if (numberSiblings == 3) {
			vacationHome = "Portland, Oregon.";

		} else if (numberSiblings > 3) {
			vacationHome = "Columbus.";
		}else {
			vacationHome = "UlaanBattar";
		}

		System.out.println("Enter your age");
		int ageNumber = input.nextInt();
        int yearsRetire;
		if (ageNumber % 2 == 0) { // if ageNumber is evenly divisible by 2
			yearsRetire=10;
		} else {
			yearsRetire=11;
			

		}
		System.out.println("Enter your birth month");
		int birthMonth = input.nextInt();
		if (birthMonth >= 1 && birthMonth <= 4) {
			System.out.println("You have you will have 256,00.76 in your bank account.");
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			System.out.println("You have you will have 3,687,105.42 in your bank account.");
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			System.out.println("You have you will have 86.23 in your bank account.");
		} else {
			System.out.println("account balance is zero");
			{
			}
		}
	
		System.out.println(
				firstName + " "+lastName + " will retire in "+yearsRetire+" years with *[bank balance]* in the bank\r\n, a vacation home in "
						+ vacationHome + ", and travel by "+ transport +"");
 
	}
}
