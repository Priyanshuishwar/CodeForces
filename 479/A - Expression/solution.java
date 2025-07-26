import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int a1 = 0;
		int a2 = 0;
		a1 = Math.max(a*b,a + b);
		a2 = Math.max(a1 * c, a1 + c);
		
		int a3 = 0;
		int a4 = 0;
		a3 = Math.max(b * c,b + c);
		a4 = Math.max(a3 * a,a3 + a);
		System.out.print(Math.max(a2,a4));
	}
}