import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int pilling = 2;
		int size = n * m;
		int res = size / pilling;
		System.out.print(res);
	}
}