import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
	Scanner sc = new Scanner(System.in);
	try
    {
		int val= sc.nextInt();
		System.out.print(val);
		}
	catch(Exception e){
		System.out.println("Input Mismatch Exception occurred");
		}
   }
}