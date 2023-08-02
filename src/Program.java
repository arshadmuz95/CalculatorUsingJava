
public class Program {

	public static void main(String[] args) 
	{
		int input = 0;

		while (input <= 4)
		{
			System.out.println("\nPress the number for desired operation");
			System.out.println("1. for Addition");
			System.out.println("2. for Subtraction");
			System.out.println("3. for Multiplication");
			System.out.println("4. for Division");
			System.out.println("5. for Exit");

			input = ConsoleInput.getInteger();

			switch (input) 
			{
			case 1: 
			{
				System.out.println("You have opted for Addition");
				System.out.println("Enter the first number");
				int num1 = ConsoleInput.getInteger();

				System.out.println("Enter the second number");
				int num2 = ConsoleInput.getInteger();

				int add = Calculator.add(num1, num2);

				System.out.println("Addition is " + add);
			}
				break;

			case 2: 
			{
				System.out.println("You have opted for Subtraction");
				System.out.println("Enter the first number");
				int num1 = ConsoleInput.getInteger();

				System.out.println("Enter the second number");
				int num2 = ConsoleInput.getInteger();

				int subtract = Calculator.subtract(num1, num2);
				
				System.out.println("Subtraction is " + subtract);

			}
				break;

			case 3: 
			{
				System.out.println("You have opted for Multiplication");
				System.out.println("Enter the first number");
				int num1 = ConsoleInput.getInteger();

				System.out.println("Enter the second number");
				int num2 = ConsoleInput.getInteger();

				Calculator objCalculator = new Calculator();

				int result = objCalculator.multiply(num1, num2);
				System.out.println("Multiplication is " + result);
			}
				break;
				
			case 4: 
			{
				System.out.println("You have opted for Division");
				System.out.println("Enter the first number");
				int num1 = ConsoleInput.getInteger();

				System.out.println("Enter the second number");
				int num2 = ConsoleInput.getInteger();

				Calculator objCalculator = new Calculator();

				float result = objCalculator.divide(num1, num2);
				System.out.println("Division is " + result);
				
			}
				break;
				
			case 5: 
			{
				System.out.println("Thank you for using Calculator");

			}
				break;
			
		}
			
		}
	}
	
}