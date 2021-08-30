//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.


import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		int num1 = in.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		}
	}
}

//OUTPUT
//Input a number:67
//67 x 1 = 67
//67 x 2 = 134
//67 x 3 = 201
//67 x 4 = 268
//67 x 5 = 335
//67 x 6 = 402
//67 x 7 = 469
//67 x 8 = 536
//67 x 9 = 603
//67 x 10 = 670

//[Program finished]