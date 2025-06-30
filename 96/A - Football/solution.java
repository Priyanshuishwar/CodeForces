import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String st = sc.next();
	    int count = 0;
	    int max_count = 0;
	    count++;
	    for(int i =1;i < st.length();i++){
	        if(st.charAt(i) == st.charAt(i - 1)){
	            count++;
	        }
	        else{
	            count = 0;
	            count++;
	        }
	        max_count = Math.max(max_count,count);
	       // if(count >= 7){
	       //     System.out.print("YES");
	       //     break;
	       // }
	       // else{
	       //     System.out.print("NO");
	       // }
	    }
	    if(max_count >= 7){
	        System.out.print("YES");
	    }
	    else{
	        System.out.print("NO");
	    }
	}
}