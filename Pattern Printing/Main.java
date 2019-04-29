import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
Scanner sc= new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
int k,l;
for(int i=0;i<row;i++){
k=row-i;
l=row;
for(int j=0;j<col;j++){
if(l>k){
System.out.print(l);
l--;
}else {
System.out.print(l);
}
}
System.out.println("");
}
    }
}