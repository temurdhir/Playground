import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
Scanner sc= new Scanner(System.in);
char c =sc.next().charAt(0);
int k=sc.nextInt();

if(c>='A'&&c<='Z'){
c=(char)(c-k);
System.out.println(c);
}
if(c>='a'&&c<='z'){
c=(char)(c-k);
if(c<'a'){
c=(char)(c+26);
}
System.out.println(c);
}



    }
}