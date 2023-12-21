/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */

public class Coins 
{
	public static void main(String[] args) 
	{
		//Recives number of cents
		int total = Integer.parseInt(args[0]);

		//Calculates the amount of quarters
		int q = total/25;

		//Calculates the amount of cents
		int cents = total%25;

        System.out.println("Use " + q + " quarters and " + cents + " cents");
	}
}