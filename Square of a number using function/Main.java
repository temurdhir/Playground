import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int result=	0;
	
	
      result=square(n);
	System.out.println(result);
	} 
    public static int square(int num){
      return num*num;
}
}