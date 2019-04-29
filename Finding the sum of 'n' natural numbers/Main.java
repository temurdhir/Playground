import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
	Scanner sc= new Scanner(System.in);
	int num= sc.nextInt();
	int sum=sum(num);
System.out.print(sum);
    }
public static int sum(int n){
if(n>0){
return n+sum(n-1);
}else{
return 0;
}
}
}