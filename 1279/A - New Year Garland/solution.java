import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int r = sc.nextInt();
		    int b = sc.nextInt();
		    int g = sc.nextInt();
		    
		    int maxi = 0;
		    maxi = Math.max(maxi,Math.max(r,Math.max(g,b)));
		    int sum = r + b + g - maxi;
		    
		    if(maxi <= sum + 1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}