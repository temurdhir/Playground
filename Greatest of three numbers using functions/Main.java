import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
Scanner sc= new Scanner(System.in);
	int n1= sc.nextInt();
	int n2= sc.nextInt();
	int n3=sc.nextInt();
	int temp=greatest(n1,n2);
	if(temp>n3){
	System.out.println(temp);
	
	}else{
    System.out.println(n3);
	}
	

	}
	public static int greatest(int num1,int num2){
    if(num1>num2){
    return num1;	
	}
    else {
    return num2;
    }
    }
}