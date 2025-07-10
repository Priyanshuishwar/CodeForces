import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[] = new char[n];
		
		for(int i = 0; i < n ; i++){
		    arr[i] = sc.next().charAt(0);
		  //  arr[i] = sc.next();
		}
		int count = 1;
		for(int i = 1; i < n ; i++){
		    if(arr[i] != arr[i - 1]){
		        count++;
		    }
		}
		System.out.print(count);
	}
}