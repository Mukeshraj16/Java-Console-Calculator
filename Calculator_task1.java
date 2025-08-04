package Calculator;

import java.util.Scanner;

public class Calculator_task1 {
	public static double Addition(double a, double b) {

		return a + b;

	}

	public static double Substraction(double a, double b) {
		return a - b;

	}

	public static double Multipilication(double a, double b) {
		return a * b;
	}

	public static double Division(double a, double b) {
		if (a == 0 || b == 0) {
			System.out.println("Error: Division by zero is not possible");
			return Double.NaN;// Return 'not a zero'
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ContinueCalculation = true;
		System.out.println("welcome to the java console calculator");
		while (ContinueCalculation) {
			System.out.println("Choose the operation below:");
			System.out.println("1.Addition (+)");
			System.out.println("2.Substraction (-)");
			System.out.println("3.Multiplication (*)");
			System.out.println("4.Division (/)");
			System.out.println("5.Exit----->");
			System.out.println("Enter Your Choice Below:");
			int choice = sc.nextInt();
			if (choice == 5) {
				ContinueCalculation = false;
				System.out.println("Thank you for Choosing java console Calculator,Have a Nice Day!");
				System.out.println("---------------------------------");
				break;

			}
			System.out.println("---------------------------------");
			System.out.println("Enter the First Number");
			double a = sc.nextDouble();
			System.out.println("Enter the Second Number");
			double b = sc.nextDouble();
			double result = 0;
			switch (choice) {
			case 1:
				result = Addition(a, b);
				System.out.println("Additon of Two number is :" + result);
				System.out.println("---------------------------------");
				break;
			case 2:
				result = Substraction(a, b);
				System.out.println("Substraction of Two number is :" + result);
				System.out.println("---------------------------------");
				break;
			case 3:
				result = Multipilication(a, b);
				System.out.println("Multipilication of two number is :" + result);
				System.out.println("---------------------------------");
				break;
			case 4:
				result = Division(a, b);
				System.out.println("Divison of two number is :" + result);
				System.out.println("---------------------------------");
				break;
			default:
				System.out.println("Invalid choice :Select between 1-5 ");
				System.out.println("---------------------------------");
				break;

			}

		}
		sc.close();

	}

}
