import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		int p = sc.nextInt();
		int a[] = new int[p];
		for(int i = 0; i < p;i++){
		    a[i] = sc.nextInt();
		    set.add(a[i]);
		}
		int q = sc.nextInt();
		int b[] = new int[q];
		for(int i = 0; i < q; i++){
		    b[i] = sc.nextInt();
		    set.add(b[i]);
		}
		if(set.size() == n){
		    System.out.print("I become the guy.");
		}
		else{
		    System.out.print("Oh, my keyboard!");
		}
		
	}
}