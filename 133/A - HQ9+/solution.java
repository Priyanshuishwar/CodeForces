import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean flag = false;
		for(int i = 0; i < str.length(); i++){
		    if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9'){
		        flag = true;
		        break;
		    } 
		    
		}
		if(flag){
		    System.out.print("YES");
		}
		else{
		    System.out.print("NO");
		}
	}
}