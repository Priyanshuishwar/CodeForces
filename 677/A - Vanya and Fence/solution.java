import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int h = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0; i < n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int ans = 0;
	    for(int i = 0; i < n;i++){
	        if(arr[i] > h){
	            ans += 2;
	        }
	        else{
	            ans += 1;
	        }
	    }
	    System.out.print(ans);
	}
}