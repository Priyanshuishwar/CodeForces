import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = 0;
        
        while(k != 0){
            if(n % 10 != 0){
                n = n  - 1;
                k--;
            }
            else{
                n = n / 10;
                k--;
            }
        }
        System.out.print(n);
    }
}