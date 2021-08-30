//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.Scanner;
public class CountNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number,
			countPositive = 0,
			countNegative = 0,
			countZero = 0;
		char choice;
		do {
			System.out.print("Enter the number:");
			number = console.nextInt();
			if (number > 0) {
				countPositive++;
			} else if (number < 0) {
				countNegative++;
			} else {
				countZero++;
			}
			System.out.print("Do you want to continue y/n? ");
			choice = console.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("Positive numbers: " + countPositive);
		System.out.println("Negative numbers: " + countNegative);
		System.out.println("Zero numbers: " + countZero);
	}
}

//OUTPUT
//Enter the number:80
//Do you want to continue y/n? y
//Enter the number:70
//Do you want to continue y/n? n
//Positive numbers: 2
//Negative numbers: 0
//Zero numbers: 0

//[Program finished]