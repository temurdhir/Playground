import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
	int sum=0;
	int first,last;
	
	while(a>10){
	last=a%10;
    a=a/10;
	sum=sum+last;	
	}first=a;
sum=sum+first;

	System.out.println(sum);
	}
}