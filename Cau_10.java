/**
 * Created by Thync on 9/2/2015.
 */
import java.util.Scanner;

public class Cau_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        proc(n);
    }
    public static void proc(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(C(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static int C(int n, int k){
        int result = 1;
        for(int i = 1; i<=k; i++){
            result = result*n/i;
            n--;
        }
        return result;
    }

}
