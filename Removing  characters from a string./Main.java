import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
Scanner sc=new Scanner(System.in);
	String str= sc.nextLine();
	String str1= sc.nextLine();
	
	StringBuilder sb= new StringBuilder(str);
	int len1= sb.length();
	int len2= str1.length();
	int count=0;
    for(int i=0;i<len1;i++){
		for(int j=0;j<len2;j++){
			if(sb.charAt(i)==str1.charAt(j)){
					sb.setCharAt(i,'$');
					}
				}
		}
	for(int i=0;i<len1;i++){
			if(sb.charAt(i)!='$'){
			System.out.print(sb.charAt(i));
			}}
  }
}