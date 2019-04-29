import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int sum=0,j=1;
	for(int i=0;i<n;i++){
		sum=sum+j;
	j++;
	}
	System.out.println(sum);
	}
}