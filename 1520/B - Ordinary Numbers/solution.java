import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int count = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            for(int i = 1;i<= 9;i++){
                long ordinary = i;
                
                while(ordinary <= n){
                    count++;
                    ordinary = ordinary * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}