/*
convert c to f
*/
import java.util.Scanner;
public class CtoF{
	public static void main(String args[])
	{
	Scanner s=new Scanner (System.in);
	System.out.println("Temp conversion");
	System.out.println("1.Convert C to F\n"+"2.Convert F to C\n");
	System.out.println("Enter your choice:");
	int ch= s.nextInt();
	 System.out.println("enter the temp value");
	 int Temp_val= s.nextInt();
	 int ans;
	 switch(ch)
	 {
	 case 1: ans= (Temp_val*9/5)+32;
	 System.out.println("The F value is:"+ans);
	 break;
	 case 2: ans= (Temp_val-32)*5/9;
	 System.out.println("The C value is:"+ans);
	 break;
	 }
}
}
