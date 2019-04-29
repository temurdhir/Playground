import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
	Scanner sc= new Scanner(System.in);
	int base=sc.nextInt();
	int exp=sc.nextInt();
	int val=base;
	while(exp>1){
		val=val*base;
		exp--;
		}
	System.out.print(val);
    }
}