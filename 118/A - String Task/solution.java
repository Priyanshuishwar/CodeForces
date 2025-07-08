import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    str = str.toLowerCase();
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < str.length(); i++){
	        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y'){
	           // sb.delete(i,i+1);
	           continue;
	        }
	        else{
	            sb.append('.').append(str.charAt(i));
	        }
	    }
	    System.out.print(sb.toString());
	}
}