import java.util.Scanner;
public class Primenumber{
	public static void main(String args[])
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a number:");
		int num= scan.nextInt();
		int flag=0;
		for (int i = 2; i < num;i++)
		{
          	if (num%i == 0)
		flag=1;
		break;
		}
		if(flag==0)
		{
		System.out.println("Entered number is prime");
		}
		else
		{
		System.out.println("Entered number is not prime");
		}
	}
}
	
