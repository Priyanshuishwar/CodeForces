import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str[] = s.split("\\+");
		Arrays.sort(str);
		int n = str.length;
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(i < n){
		    if(i == n-1){
		        sb.append(str[i]);
		    }
		    else{
		        sb.append(str[i]);
		        sb.append("+");
		    }
		    i++;
		}
		System.out.print(sb.toString());
	}
}