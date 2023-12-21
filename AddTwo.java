/*
 * Adds two given integers and prints the result in a fancy way.
 */
class AddTwo 
{
    public static void main(String args[]) 
    {
        //Recives two integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Sums a+b
        int sum = a + b; 
        
        System.out.println(a + " + " + b + " = " + sum); //Prints sum
    }
}