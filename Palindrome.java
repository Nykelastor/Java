import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		int reverse=0;
		int rem;
		int n;
		n=num;
		System.out.println("Entered number:"+num);
		while(num!=0)
		{
		 rem=num%10;
		 reverse=reverse*10+rem;
		 num= num/10;
		 }
	         if (reverse==n)
	         System.out.println("\n"+n+"is a palindrome");
	         else
	         System.out.println("\n"+n+"is not a palindrome");
	 }
} 
