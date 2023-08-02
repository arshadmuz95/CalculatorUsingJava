
public class Calculator
{
	// static method

	public static int add(int num1, int num2) 
	{
		return num1 + num2;
	}
	
	public static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}
	
	// non-static or instance method
	
	public int multiply(int num1, int num2)	
	{
		return num1 * num2;
	}
	
	public float divide(int num1, int num2)
	{
		return (float) num1 / num2;
	}
}
