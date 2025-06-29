import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    String t = sc.next();
	    StringBuilder sb = new StringBuilder(s);
	    sb.reverse();
	    if(sb.toString().equals(t)){
	        System.out.print("YES");
	    }
	    else{
	        System.out.print("NO");
	    }
	    
	}
}