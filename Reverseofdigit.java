import java.util.Scanner;
public class Reverseofdigit
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		int reverse=0;
		int rem;
		while(num!=0)
		{
		 rem=num%10;
		 reverse=reverse*10+rem;
		 num= num/10;
		 }
		 System.out.println("Reversed number:"+reverse);
	 }
}
