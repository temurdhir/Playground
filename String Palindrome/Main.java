import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // Get the input string
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    // Create another string temp
    StringBuilder temp = new StringBuilder("");
    for(int idx = (str_len - 1); idx >= 0; idx--)
    {
      char ch = sb.charAt(idx);
      temp.append(ch);
    }
    if(str.equals(temp.toString())==true){
	System.out.print("Yes");
		}else{
	System.out.print("No");
}
  }
}