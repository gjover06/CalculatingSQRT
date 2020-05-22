/**
Author:George Samu
Date:5/22/2020

*/


public class CalculatingSQRT
{

	public static void main (string[]args)
	{
	
	Scanner keyboard =new Scanner(System.in);
	System.out.Println("Type a positive number: ");
	double number=keyboard.nextDouble();
	double squareRoot = Math.sqrt(number);
	System.out.println("The square root of " + number + "is" +
					squareRoot);
					
	}//end main
}//end CalculatingSQRT
	
	