import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
	Scanner sc= new Scanner(System.in);
	int size=sc.nextInt();
int m=0;
	int arr[]= new int[size];
	for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();
		}
	for(int i=1;i<=size;i++){
		int flag=0;
      	for(int j=0;j<size;j++){
if(arr[j]==i){
flag=1;
break;
}}if(flag==0){
m=i;
break;

}
			
			}
System.out.print(m);
    }
}