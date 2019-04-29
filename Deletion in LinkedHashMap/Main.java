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
	String n=reader.readLine();
	
	System.out.println("Enter the number of values to be inserted in map:"+n);
	LinkedHashMap<String,String> stud= new LinkedHashMap<String,String>(); 
	int k= Integer.parseInt(n);
	int count=0;
	for(int i=0;i<k;i++){
	String key=reader.readLine();
	String value=reader.readLine();
	stud.put(key,value);
	}
	System.out.println(stud);
	String del=reader.readLine();
	System.out.println("Enter the index to be removed:"+del);
	stud.remove(del);
	System.out.println(stud);
	
	System.out.println("Size of map is : "+stud.size());
	
	
    }
}