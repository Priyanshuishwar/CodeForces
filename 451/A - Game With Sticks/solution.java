import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 0;
		a = Math.min(n,m);
		if(a % 2 == 1){
		    System.out.print("Akshat");
		}
		else{
		    System.out.print("Malvika");
		}
	}
}