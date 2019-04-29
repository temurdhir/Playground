import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
Scanner sc= new Scanner(System.in);
String str= sc.nextLine();
int key=sc.nextInt();
StringBuilder sb=new StringBuilder(str);
int len=str.length();
for(int i=0;i<len;i++){
char ch=str.charAt(i);
if(ch >= 'A' && ch <= 'Z')
       {
           int offset = ch - 'A';
           offset = (offset - key) % 26;
if(offset<0){
offset=offset+26;
}
           ch = (char)(offset + 'A');
       }
       else if(ch >= 'a' && ch <= 'z')
       {
           int offset = ch - 'a';
           offset = (offset - key) % 26;
		if(offset<0){
offset=offset+26;
}
           ch = (char)(offset + 'a');
       }
		sb.setCharAt(i,ch);
}
System.out.print(sb);
  }
}