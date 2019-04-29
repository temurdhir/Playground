import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
	Scanner sc= new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	String temp[]= str2.split(" ");
	int len=temp.length;
	for(int i=0;i<len;i++){
	System.out.println(temp[i]);
		}
    }
}