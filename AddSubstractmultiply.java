
//* java program to add , Substract,multiply and divide two numbers//*



import java.util.Scanner;
 
public class JavaProgram
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;

    System.out.println("Addition = " + add);
    System.out.println("Substraction = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}

//OUTPUT
//Enter Two Numbers : 35 67
//Addition = 102
//Substraction= -32
//Multiplication = 2345
//Division = 0.52238804

//[Program finished]
