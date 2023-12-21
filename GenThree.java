/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) 
	{
		//Recives two integers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		//Generates three random numbers in the given range [a,b)
		int r1 = ((int)(Math.random() * (b-a) + a));
		int r2 = ((int)(Math.random() * (b-a) + a));
		int r3 = ((int)(Math.random() * (b-a) + a));

		//checks for the minimal value
		int min1 = (Math.min(r1, r2));
		int min2 = (Math.min(r2, r3));
		int minimal = (Math.min(min1, min2));

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println("The minimal generated number was " + minimal);


	}
}
