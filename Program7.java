/*
Program4-read Keyboard Input-Method-3
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Program7{

	public static void main(String args[]) throws Exception
	{

	InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
					System.out.println("Enter your name:");
					String name = reader.readLine();
					System.out.println("My name:"+name);
					

	}
}	
