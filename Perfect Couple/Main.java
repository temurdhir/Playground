import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int m=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
int sum=arr[i]+arr[j];
if(sum==m){
System.out.println(arr[i]+","+" "+arr[j]);
}
}


}
    }
}