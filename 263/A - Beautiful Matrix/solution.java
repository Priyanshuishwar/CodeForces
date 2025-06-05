import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0, col = 0;
        int arr[][] = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j = 0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j =0;j<5;j++){
                if(arr[i][j] == 1){
                     row = i;
                     col = j;
                    break;
                }
            }
        }
        int row1 = Math.abs(2 - row);
        int col1 = Math.abs(2 - col);
        System.out.println(row1 + col1);
    }
}