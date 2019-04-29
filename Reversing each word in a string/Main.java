import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
Scanner sc= new Scanner(System.in);
String str= sc.nextLine();
String [] words= str.split(" ");
String reversedString="";
for(int i=0;i<words.length;i++){
String word=words[i];
String reverse="";
for(int j=word.length()-1;j>=0;j--){
reverse=reverse+word.charAt(j);
}
reversedString = reversedString + reverse + " ";

}
System.out.println(reversedString);

  }
}