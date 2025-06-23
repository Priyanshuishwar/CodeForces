import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int i = 1;
		while(w > 0){
		    int ans = 0;
		    ans = i * k;
		    n = n - ans;
		    i++;
		    w--;
		}
		if(n >= 0){
		    System.out.print(0);
		}
		else{
		    System.out.print(Math.abs(n));
		}
	}
}