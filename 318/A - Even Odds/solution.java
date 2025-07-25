import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long numm_ods = (n + 1) / 2;
		long ans = 0;
		if(numm_ods >= k){
		    ans = 2 * k - 1;
		}
		else{
		    long num_even = k - numm_ods;
		    ans = 2 * num_even;
		}
		System.out.print(ans);
	}
}