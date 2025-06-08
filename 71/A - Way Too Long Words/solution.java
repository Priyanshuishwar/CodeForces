import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  
        sc.nextLine();         
 
        while (t-- > 0) {
            String word = sc.nextLine(); 
            int len = word.length();
 
            if (len > 10) {
                String abbreviation = "" + word.charAt(0) + (len - 2) + word.charAt(len - 1);
                System.out.println(abbreviation);
            } else {
                System.out.println(word);
            }
        }
    }
}