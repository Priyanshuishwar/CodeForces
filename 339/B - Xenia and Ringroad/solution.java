import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i = 0; i < m; i++){
		    arr[i] = sc.nextInt();
		}
		long last_visit = arr[0];
		long ans = 0;
		ans = arr[0] - 1;
		
		for(int i = 1; i < m; i++){
		    if(arr[i - 1] <= arr[i] && arr[i] <= n){
		        ans += arr[i] - last_visit;
		        last_visit = arr[i];
		    }
		    else{
		        ans += arr[i] + n - last_visit;
		        last_visit = arr[i];
		    }
		}
		System.out.print(ans);
	}
}