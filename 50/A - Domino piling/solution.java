import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int box_Size = n * m;
		int piling = 2;
		int res = box_Size / piling;
		System.out.print(res);
	}
}