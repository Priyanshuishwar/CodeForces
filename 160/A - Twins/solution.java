import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		Integer arr[] = new Integer[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		    sum += arr[i];
		}
		Arrays.sort(arr,Collections.reverseOrder());
		int coins = 0;
		int leftSum = 0;
		int rightSum = 0;
		for(int i = 0; i < n; i++){
		    leftSum += arr[i];
		    rightSum = sum - leftSum;
		    coins++;
		    if(leftSum > rightSum){
		        break;
		    }
		}
		System.out.print(coins);
	}
}