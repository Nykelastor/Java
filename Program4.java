/*
Program4-read Keyboard Input-Method-1
*/
import java.util.Scanner;
public class Program4{

	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = scanner.nextLine();
		System.out.println("My Name:"+name);
		System.out.println("Enter Roll No:");
		Integer rollno = scanner.nextInt();
		System.out.println("Roll NO:"+rollno);
	}
}	
