import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	int arr[]=new int[26];
	for(int i=0;i<26;i++){
		arr[i]=0;
		}
	for(int i=0;i<str.length();i++){
		 if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                int offset = str.charAt(i) - 'A';
                arr[offset]++;
                
            }
      
		if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
           int offset=str.charAt(i)-'a';
			arr[offset]++;
		}
		
		}
		for(int i=0;i<26;i++){
		if(arr[i]==0){
		char offset=(char)('a'+i);
		System.out.print(offset+" ");
		}
		}
    }
}