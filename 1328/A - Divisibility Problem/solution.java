import java.util.Scanner;
 
public class DivisibilityMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Read the number of test cases
        int t = sc.nextInt();
 
        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            // Read a and b for the current test case
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            // Calculate the remainder
            int remainder = a % b;
 
            // Calculate the number of moves
            int moves;
            if (remainder == 0) {
                moves = 0; // Already divisible
            } else {
                moves = b - remainder; // Moves to reach the next multiple
            }
 
            // Print the result for the current test case
            System.out.println(moves);
        }
 
        sc.close(); // Close the scanner
    }
}