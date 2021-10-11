/*
odd or even
*/
import java.util.Scanner;
public class odd_or_even{

	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		Integer num = scanner.nextInt();
		if (num % 2==0)
		System.out.println("number is even");
		else
		System.out.println("number is odd");
	}
}	
