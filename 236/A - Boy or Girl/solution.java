import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    HashSet<Character> set = new HashSet<>();
	    for(int i = 0; i < str.length();i++){
	        set.add(str.charAt(i));
	    }
	    if(set.size() % 2 == 0){
	        System.out.print("CHAT WITH HER!");
	    }
	    else{
	        System.out.print("IGNORE HIM!");
	    }
	}
}