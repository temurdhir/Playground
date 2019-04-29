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
	Set<String> s= new LinkedHashSet<String>();
	String ab= reader.readLine();	
     String x[] = ab.split(",");
	for(String d:x){
		s.add(d);
		}
	System.out.print(s);
	
    }
}