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
	int element=sc.nextInt();
	int element2=sc.nextInt();
	int count=0,count2=0;
	for(int i=0;i<size;i++){
	if(element==arr[i]){
	System.out.println(i);
	count++;
	}

	}
	for(int i=0;i<size;i++){
	if(element2==arr[i]){
	System.out.println(i);
	count2++;
	}}
	if(count2==0){
	System.out.println(-1);
    }
	
	
}}