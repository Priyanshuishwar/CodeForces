import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = str.replace("WUB"," ");
		String ns = s.trim();
		System.out.print(ns);
	}
}