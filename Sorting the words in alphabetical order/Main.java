import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
Scanner sc= new Scanner (System.in);
int num=sc.nextInt();
String[] words= new String[num];
String temp;
for(int i=0;i<num;i++){
words[i]=sc.next();

}
for(int i=0;i<num;i++){

            for (int j = i + 1; j < num; j++) { 
                if (words[i].compareTo(words[j])>0) 
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
          }
}
for(int i=0;i<num;i++){
words[i]=words[i].toLowerCase();
System.out.println(words[i]);

}
  }
}