import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n * k];
		    for(int i = 0; i < n*k; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int medianIndx = (n + 1) / 2;
		    long sum = 0;
		    int indx = n * k - (n - medianIndx + 1);
		    for(int i = 0; i < k; i++){
		        sum += arr[indx];
		        indx -= (n - medianIndx + 1);
		    }
		    System.out.println(sum);
		}
		
	}
}