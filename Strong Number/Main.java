import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
 int m,sum=0,temp=n,fact=1;
	while(n!=0){
		 m=n%10;
		for(int i=1;i<=m;i++){
			fact=fact*i;
        	}
	     sum=sum+fact;
		n=n/10;
		fact=1;
    }
	
	if (sum==temp){
	System.out.println("Yes");}
	else{
	System.out.println("No");}	
	}
	}
