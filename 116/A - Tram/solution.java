import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		for(int i = 0; i < n;i++){
		    arr[i][0] = sc.nextInt();
		    arr[i][1] = sc.nextInt();
		}
		int maxi = 0;
		int tram = 0;
		for(int i = 0; i <n;i++){
		    tram += arr[i][1] - arr[i][0];
		    maxi = Math.max(maxi,tram);
		}
		System.out.print(maxi);
	}
}