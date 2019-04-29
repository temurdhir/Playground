import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int sum=0;
    sum=findsum(n);
	System.out.println(sum);
	} 
    public static int findsum(int num){
		int sum1=0;
      for(int i=0;i<=num;i++){
      	sum1=sum1+i;
	
		}
	return sum1;
}
}