//Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number;
		int firstTerm = 0,
			secondTerm = 1,
			thirdTerm;
		System.out.print("Enter the number:");
		number = console.nextInt();
		System.out.print(firstTerm + " " + secondTerm + " ");
		for (int i = 3; i <= number; i++) {
			thirdTerm = firstTerm + secondTerm;
			System.out.print(thirdTerm + " ");
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
	}
}

//OUTOUT
//Enter the number:25
//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368
//[Program finished]
