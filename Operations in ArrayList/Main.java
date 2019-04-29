import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
	BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
	List li = new ArrayList();
	boolean flag=true;
	do{
	 
	System.out.println("Choose any one:");
	System.out.println("1.Insert");
	System.out.println("2.delete");
	System.out.println("3.Display");
    System.out.println("4.Exit");
	String choice= reader.readLine();
	int ch=Integer.parseInt(choice);
	switch(ch){
      case 1:
		String text= reader.readLine();
		String string[]= text.split(",");
		for(String i:string){
			li.add(i);
			}
		break;
      case 2:
		String val=reader.readLine();
		int pos=Integer.parseInt(val);
		li.remove(pos);
		System.out.println("Enter the index value to be deleted:"+val);
		
		break;
      case 3:
		System.out.println(li);
		break;
      case 4:
	flag=false;
		break;
    }
    }while(flag==true);
    }
}