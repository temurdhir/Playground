import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int temp=n;
    int m, sum=0;
		while(n!=0){
			m=n%10;
			sum+=m*m*m;
			n=n/10;
	}
   if(sum==temp){
	
	System.out.println("Armstrong Number");}
 else{
System.out.println("Not a Armstrong Number");}
}}