import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
Scanner sc= new Scanner (System.in);
int size= sc.nextInt();
int arr[]= new int[size];
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
int mid=size/2;
int temp;
for(int i=0;i<mid-1;i++){
for(int j=0;j<mid-1-i;j++){
if(arr[j]>arr[j+1]){

        temp = arr[j];
         arr[j] = arr[j+1];
         arr[j+1] = temp;
       
}
}
}
for(int i=0;i<size;i++){
System.out.print(arr[i]+" ");
}

  }
}