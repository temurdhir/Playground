import java.util.Scanner;
import java.io.*;
class Fibonacci extends Thread
{
  // type your code here
	public void run(){
	try{
		int a=0,b=1,c=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter the limit for Fibonacci: "+n);	
		if(n>0){
		System.out.print("The Fibonacci series is :");
		while(n>0){
		System.out.print(c+" ");
		a=b;
		b=c;
		c=a+b;
		n=n-1;	}}
		else{
			throw new Exception("Exception occurred");}
		} catch (Exception ex)
          {
               System.out.println("Exception occurred");
          }
	}
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
	Fibonacci fib= new Fibonacci();
	fib.start();
	
     }
}