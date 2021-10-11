/*
Program4-read Keyboard Input-Method-2
*/
import java.util.Scanner;
public class Program5{

	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = scanner.nextLine();
		System.out.println("Enter Roll No:");
		Integer rollno = scanner.nextInt();
		System.out.println("My name:"+name);
		System.out.println("Roll NO:"+rollno);
	}
}	
