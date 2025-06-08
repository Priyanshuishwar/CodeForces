import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fri = 3; 
// 		int m = sc.nextInt();
		int arr[][] = new int[n][fri];
		for(int i=0;i<n;i++){
		    for(int j=0;j<fri;j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
		int count = 0;
		for(int i=0;i<n;i++){
		    int temp = 0;
		    for(int j = 0;j<fri;j++){
		        if(arr[i][j] == 1){
		            temp++;
		        }
		    }
		    if(temp > 1){
		        count++;
		    }
		}
		System.out.print(count);
	}
}