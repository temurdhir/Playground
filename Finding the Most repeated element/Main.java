import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
Scanner sc= new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();		
	}
	int freq[]= new int[size];
	for(int j=0;j<size;j++){
		for(int i=0;i<size;i++){
			if(arr[i]==j){
				freq[j]++;
				}
		}
	
	}
int max=0;
for(int i=0;i<size;i++){
		if(freq[i]>max){
			max=i;
		}
	
		}
System.out.print(arr[max]);
		
  }
}