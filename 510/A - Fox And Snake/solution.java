import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean flag = false;
		char arr[][] = new char[n + 1][m + 1];
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j <= m; j++){
		        if(i % 2 != 0){
		            arr[i][j] = '#';
		        }
		        else{
		            if(flag == false){
		                if(j != m){
		                    arr[i][j] = '.';
		                }
		                else{
		                    arr[i][j] = '#';
		                }
		            }
		            else{
		                if(j != 1){
		                    arr[i][j] = '.';
		                }
		                else{
		                    arr[i][j] = '#';
		                }
		            }
		          //  flag = true;
		        }
		    }
		    if(i % 2 == 0){
		        flag = !flag;
		    }
		}
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j <= m; j++){
		        System.out.print(arr[i][j]+ "");
		    }
		    System.out.println();
		}
	}
}