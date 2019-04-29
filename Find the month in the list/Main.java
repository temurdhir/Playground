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
         
        // Reading data using readLine 
        String name = reader.readLine(); 
 		String months []= name.split(",");
        List abc = new LinkedList();
		for(String i:months){
			abc.add(i);
			}
		String find =reader.readLine();
		System.out.println(abc);
		System.out.println("Size of the linked list: "+abc.size());
		System.out.println("Is LinkedList empty? "+abc.isEmpty());
		System.out.println("Does LinkedList contains "+ find +"?");
		System.out.println(abc.contains(find));
    }
}