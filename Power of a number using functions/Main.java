import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int n1=sc.nextInt();
	int result;
	result=power(n,n1);
	System.out.println(result);
	} 
    public static int power(int num1,int num2){
      int val=1;
		for( int i=0; i<num2;i++){
        val=num1*val;
			}
		return val;
}
}