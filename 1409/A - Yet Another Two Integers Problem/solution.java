import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int ans = 0;
		    
		    if(n == m){
		      //  System.out.println("0");
		      //  break;
		    }
		    else{
		        int curr = Math.abs(n - m);
		        for(int i =10;i>=1;i--){
		            if(curr >= i){
		                int rem = curr / i;
		                curr = curr % i;
		                ans += rem;
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}