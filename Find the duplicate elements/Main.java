import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
	BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
	TreeSet<String> unique = new TreeSet<String>();
	String in=reader.readLine();
 	String abcd[]=in.split(",");
		System.out.println("Duplicate Entry is: ");
       for(String str:abcd){
           if(!unique.add(str)){
        System.out.println(str);
	   }
  }System.out.println("TreeSet is : "+unique);
    }
}