import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str.substring(0,1).toUpperCase() + str.substring(1));
	}
}