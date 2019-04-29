import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	public static boolean isValidIP(String ipAddr){
			Pattern p= Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
			Matcher m= p.matcher(ipAddr);
			return m.find();
			}
	public static boolean isValidDATE(String date){
			Pattern p= Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})");
			Matcher m= p.matcher(date);
			return m.find();
			}
	public static void main(String[] args){
	    // type your code here
		Scanner sc= new Scanner(System.in);
		String ip= sc.nextLine();	
      	String date=sc.nextLine();
      	System.out.println(ip+" is valid? "+Main.isValidIP(ip));
		System.out.println("Is "+date+" a valid date format? "+Main.isValidDATE(date));
    }

}