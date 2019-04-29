import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=n;
		for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(j==i|| j==count-i+1){
System.out.print("*");

}else{
System.out.print(" ");

}
}
System.out.print("\n");

}
	}
}