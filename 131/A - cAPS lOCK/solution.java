import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = true;
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isUpperCase(str.charAt(i))) {
                flag = false;
                break;
            }
        }
        if (flag || str.equals(str.toUpperCase())) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    sb.append(Character.toLowerCase(ch));
                } else {
                    sb.append(Character.toUpperCase(ch));
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(str);
        }
    }
}