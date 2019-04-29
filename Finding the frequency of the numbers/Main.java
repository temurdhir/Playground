import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
		int bar[]=new int[k+1];
		for(int i=1;i<=k;i++){
		bar[i]=0;
			}
				for(int i=1;i<=k;i++){
						for(int j=0;j<n;j++){
          					if(arr[j]==i){
									bar[i]++;			
										}
                		}	
        				}	 
	for(int i=1;i<=k;i++){
		System.out.println(i+" "+bar[i]);
		}
    }  
  }