import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		int sum = 0;
		int finals = 100;
		
		for(int i = 0; i < n; i++){
		    sum += finals - arr[i];
		}
		double avg = 0;
		double ans = 0;
		avg = (double) sum / n;
		ans = finals - avg;
		System.out.print(ans);
	}
}