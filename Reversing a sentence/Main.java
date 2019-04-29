import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
	Scanner sc= new Scanner(System.in);
	String str= sc.nextLine();
	StringBuilder sb= new StringBuilder(str);
	 int len= sb.length();
	int index=0;
      reverse_string(sb,index,len);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      String str1 =sb.toString();
	String[] words=str1.split(" ");
      String result="";
	int leng=words.length;
	for(int i=leng-1;i>=0;i--){
		result+=words[i]+" ";
		}
	System.out.print(result);
    }
}