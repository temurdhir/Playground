import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
	Scanner sc= new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]= new int[size];
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
    }
	int largest=arr[0];
	for(int i=0;i<size-1;i++){
	if(arr[i+1]>largest){
		   largest=arr[i+1];
}
}
System.out.print(largest);
	
	
}}