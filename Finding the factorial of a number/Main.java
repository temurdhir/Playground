import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
int temp;
int factorial=fact(num);
System.out.print(factorial);

  }
public static int fact(int a){
if(a>=1){
return a*fact(a-1);
}else{
return 1;
}

}
}