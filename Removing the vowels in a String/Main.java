import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
	Scanner sc= new Scanner (System.in);
	String str= sc.nextLine();
	StringBuilder str1 = new StringBuilder();
	int len=str.length();
    int idx=0;
	for(int i=0;i<len;i++){
		if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u'){
		str1.append(str.charAt(i));
        }
		}
	int len1=str1.length();
	for(int i=0;i<len1;i++){
		System.out.print(str1.charAt(i));
		}
  }
}