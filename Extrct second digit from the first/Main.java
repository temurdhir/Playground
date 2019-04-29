import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
	int sum=0;
	int first,last;
	
	while(a>100){
    a=a/10;
		
	}first=a;
	last=a%10;
 
	System.out.println(last);
	}
}