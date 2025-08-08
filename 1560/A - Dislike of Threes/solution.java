import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t -- > 0){
		    int n = sc.nextInt();
		    int num = 1;
		    int count = 0;
		    while(true){
		        if(num % 3 != 0 && num % 10 != 3){
		            count++;
		        }
		        if(count == n){
		            System.out.println(num);
		            break;
		        }
		        num++;
		    }
		}
	}
}