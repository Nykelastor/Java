import java.util.Scanner;
public class SumofDigit
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		int m;
		int sum=0;
		while(num>0) 
		{
		  m=num%10;
		  sum= sum+m;
		  num = num / 10; 
		  } 
		  System.out.println("Sum of digits: "+sum); 
	} 
}


