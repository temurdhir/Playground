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
	String inp=reader.readLine();
	String arr[]=inp.split(",");
	int len=arr.length;
	TreeSet<String> set = new TreeSet<String>();
	for(String s:arr){
		set.add(s);
		}
	try{
	for(int i=0;i<len;i++){
		System.out.println(set);
		String la=set.last();
		set.remove(la);
		
		}
	System.out.println(set);
    }catch(Exception e){
		
		}
}}