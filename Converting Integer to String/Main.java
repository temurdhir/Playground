import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int str_len = str.length();
        int n = 0, idx = 0;
		boolean isNegative=false;
		 if( str.charAt(0) == '-' ){
            isNegative = true;
            idx = 1;
        }
        while(idx < str_len)
        {
           if((str.charAt(idx) >= 48) && (str.charAt(idx) <= 57))
           {
            n = (n * 10) + (str.charAt(idx) - 48);
            idx++;
           }
        }
	if(isNegative==true){
		n=-n;
        System.out.print(n);
	}else{System.out.print(n);}
}
}