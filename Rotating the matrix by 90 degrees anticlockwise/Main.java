import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
int k;
for(k = r-1; k>=0; k--)
        {
  	        for(i = 0; i < r ; i++){
    	    System.out.print(matrix[i][k]+" ");
        }System.out.println("");
}

       
    }
   
    }
