import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
Scanner sc= new Scanner(System.in);
int size= sc.nextInt();
int arr[]= new int[size];
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
for(int j=i+1;j<size;j++){

if(arr[i]<arr[j]){
System.out.println(arr[i]+","+arr[j]);
}
}
}
  }
}