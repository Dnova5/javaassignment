/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
*/  
  import java.util.Scanner;

 
public class Pyramid
{
  
public static void main (String[]args)
  {
	
	  // Create a Scanner object because we need to accept input from the user 
	  Scanner input = new Scanner (System.in);
	
 
	  // Prompt the user to enter an integer from 1 to 15 
	  System.out.print ("Enter the number of lines for the pyramid: ");
	
      int lines = input.nextInt ();
	
 // we need nested for loop to make the pyramid 
	  // Display pyramid
	  for (int rows = 1; rows <= lines; rows++)
	  {
		
		  // Create spaces in each row 
		  for (int j = lines - rows; j >= 1; j--)
		  {
			
System.out.print ("  ");
		  
} 
		  // Create decending numbers in each row
		  for (int l = rows; l >= 2; l--)
		  {
			
System.out.print (l + " ");
		  
} 
		  // Create ascending number in each row the 
		  for (int i = 1; i <= rows; i++)
		  {
			
System.out.print (i + " ");
		  
} 
		  // End line
		  System.out.println ();

} 
} 
}
