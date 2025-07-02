import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt(); // number of students
        int m = sc.nextInt(); // number of puzzles
        int[] puzzles = new int[m];
 
        for (int i = 0; i < m; i++) {
            puzzles[i] = sc.nextInt();
        }
// Greedy question
        Arrays.sort(puzzles); // Sort the puzzle sizes
 
        int minDiff = Integer.MAX_VALUE;
 
        // Slide a window of size n across the sorted array
        for (int i = 0; i <= m - n; i++) {
            int diff = puzzles[i + n - 1] - puzzles[i];
            minDiff = Math.min(minDiff, diff);
        }
 
        System.out.println(minDiff);
    }
}