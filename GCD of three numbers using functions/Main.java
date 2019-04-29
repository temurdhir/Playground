import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
Scanner sc= new Scanner(System.in);
	int n1= sc.nextInt();
	int n2= sc.nextInt();
	int n3=sc.nextInt();
	int temp=gcd(n1,n2);
	int min2;
		if(temp>n3){
    		min2=n3;
				}else{
    			min2=temp;
					}
      		while(min2>=1){
			if(temp%min2==0 && n3%min2==0){
				System.out.println(min2);
			break;
			}
		min2--;
		}
	}
	public static int gcd(int num1,int num2){
			int min ,gcd=0;
    		if(num1>num2){
    			min=num2;	
				}
    			else {
    			min=num1;
    			}	
				while(min>=1){
				if(num1%min==0 && num2%min==0){
					gcd=min;
                    break;
					}
				min--;
				}
   return gcd; }
}