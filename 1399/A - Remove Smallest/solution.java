import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n ;i++){
		        arr[i] = sc.nextInt();
		    }
		  //  if(n == 1){
		  //      System.out.print("Yes");
		  //  }
		  Arrays.sort(arr);
		    int count = 0;
		    for(int i = 0; i < n - 1; i++){
		        if(Math.abs(arr[i] - arr[i + 1]) == 1 || Math.abs(arr[i] - arr[i + 1]) == 0){
		            count++;
		        }
		        else{
		            break;
		        }
		    }
		    int ans = 0;
		    ans = n - count;
		    if(ans == 1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}