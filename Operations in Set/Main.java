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
	System.out.println(s);
	
	String db =reader.readLine();
      System.out.println("Enter the value to be deleted: "+db);
	s.remove(db);
	System.out.println(s);
	String is=reader.readLine();
	System.out.println("Enter the value to be added: "+is);
	s.add(is);
	System.out.println(s);
    }
}