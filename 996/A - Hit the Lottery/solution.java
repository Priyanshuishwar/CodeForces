import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int arr[] = {100,20,10,5,1};
		for(int i = 0; i < arr.length; i++){
		    if(n >= arr[i]){
		        ans += n / arr[i];
		        n = n % arr[i];
		    }
		}
		System.out.print(ans);
	}
}