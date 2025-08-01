import java.util.*;
public class cf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int Acount = 0;
        int Bcount = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'A'){
                Acount++;
            }
            else{
                Bcount++;
            }
        }
        if(Acount > Bcount){
            System.out.println("Anton");
        }
        else if(Acount == Bcount){
            System.out.println("Friendship");
        }
        else{
            System.out.println("Danik");
        }
    }
}