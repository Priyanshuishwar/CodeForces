import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int ans = -1;
	        if(a == b && a != c && b != c){
	            ans = c;
	        }
	        if(a == c && b != a && b != c){
	            ans = b;
	        }
	        if(b == c && a != b && a != c){
	            ans = a;
	        }
	        System.out.println(ans);
	    }
	}
}