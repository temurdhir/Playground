import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner sc =new Scanner(System.in);
		String str= sc.nextLine();
		String str2=sc.nextLine();
		Pattern p= Pattern.compile(str);
		Matcher m= p.matcher(str2);
		int count=0;
		if(m.find()){
        count++;
		System.out.println("found: "+count+" : "+m.start()+" - "+m.end());
		while(m.find()){
		count++;
		System.out.println("found: "+count+" : "+m.start()+" - "+m.end());
		}
		}else{
			System.out.println("The given word is not present in the string");
			}
		if(count!=0){
		System.out.println(count);
    }}
}