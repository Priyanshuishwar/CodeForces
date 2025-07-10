import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("I hate it");
		StringBuilder sb2 = new StringBuilder("I hate that ");
		StringBuilder sb3 = new StringBuilder("I love it");
		StringBuilder sb4 = new StringBuilder("I love that ");
		for(int i = 0; i < n;i++){
		    if(i == n - 1){
		        if(i % 2 == 0){
		            sb.append(sb1);
		        }
		        else{
		            sb.append(sb3);
		        }
		    }
		    else{
		        if(i % 2 == 0){
		            sb.append(sb2);
		        }
		        else{
		            sb.append(sb4);
		        }
		    }
		}
		System.out.print(sb.toString());
	}
}