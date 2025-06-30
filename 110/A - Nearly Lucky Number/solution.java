import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // Use long to handle large numbers
        int luckyCount = 0;
 
        // Count lucky digits in the number
        while (n > 0) {
            long rem = n % 10;
            if (rem == 4 || rem == 7) {
                luckyCount++;
            }
            n /= 10;
        }
 
        // Now check if luckyCount is a lucky number
        if (isLucky(luckyCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    // Function to check if a number is a lucky number
    static boolean isLucky(int num) {
        if (num == 0) return false;
 
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
 
        return true;
    }
}