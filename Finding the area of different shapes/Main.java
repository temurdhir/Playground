import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
	Scanner sc= new Scanner(System.in);
	int s,l,b,base,h,r;
	double area;
	int choice=sc.nextInt();
	switch(choice){
      case 1:
		s=sc.nextInt();
		area=s*s;
		System.out.print(area);
		break;
      case 2:
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
		System.out.print(area);
		break;
      case 3:
		base= sc.nextInt();
		h=sc.nextInt();
		area=0.50f*base*h;
		System.out.print(area);
		break;
      case 4:
		r=sc.nextInt();
		double pi=3.13999999999999972222222d;
		area=pi*(r*r);
		System.out.print(area);
		}
    }
}