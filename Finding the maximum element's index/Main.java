import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int maxIndex;
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
if(arr[0]>arr[1]){
maxIndex=0;
}else{maxIndex=1;}
for(int j=2;j<n;j++){
if(arr[maxIndex]<arr[j])
{
maxIndex=j;
}
}  
System.out.println(maxIndex);
}
}