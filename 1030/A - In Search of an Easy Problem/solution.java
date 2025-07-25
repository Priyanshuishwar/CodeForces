import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		int odd_count = 0;
		for(int i = 0; i < n; i++){
		    if(arr[i] == 0){
		        odd_count++;
		    }
		}
		if(odd_count == n){
		    System.out.print("EASY");
		}
		else{
		    System.out.print("HARD");
		}
	}
}