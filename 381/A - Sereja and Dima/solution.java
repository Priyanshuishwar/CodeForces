import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++){
		    arr[i] = sc.nextInt();
		}
		int left = 0;
		int right = n - 1;
		int seema = 0;
		int dima = 0;
		boolean turn = true;
		while(left <= right){
		    int choosen = 0;
		    if(arr[left] > arr[right]){
		        choosen = arr[left];
		        left++;
		    }
		    else{
		        choosen = arr[right];
		        right--;
		    }
		    if(turn){
		        seema += choosen;
		    }
		    else{
		        dima += choosen;
		    }
		    turn = !turn;
		}
		System.out.print(seema + " "+ dima);
	}
}