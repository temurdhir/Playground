import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
	int sum=0;
	int first,last;
	last=a%10;
	while(a>10){
    a=a/10;
		
	}first=a;
 
	sum=first+last;
	System.out.println(sum);
	}
}