import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	String str1=sc.nextLine();
	int len1=str.length();
	int len2=str1.length();
	int count=0;
	for(int i=0;i<=len1-len2;i++){
		int j;
		for(j=0;j<len2;j++){
			if(str.charAt(i+j)!=str1.charAt(j)){
            	break;
				}
			
			}
			if(j==len2){
			count++;
			j=0;
			}
		}
	System.out.print(count);
  } 
}