import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int small = 0;
	    int cap = 0;
	    for(int i = 0; i < s.length(); i++){
	        int ascVal = s.charAt(i) - 'a';
	        if(ascVal >=0){
	            small++;
	        }
	        else{
	            cap++;
	        }
	    }
	    StringBuilder sb = new StringBuilder();
	    if(small > cap){
	        sb.append(s.toLowerCase());
	    }
	    else if(cap > small){
	        sb.append(s.toUpperCase());
	    }
	    else{
	        sb.append(s.toLowerCase());
	    }
	    System.out.print(sb.toString());
	}
}