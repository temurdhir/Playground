import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n;
for(int i=1; i<=n;i++){

for(int col=num;col>=1;col--){
System.out.print(col);

}
System.out.print("\n");
num--;
}
	}
}