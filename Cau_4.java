/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Nhap n: ");
            n = scan.nextInt();
        }while(n < 0 || n > 90);
        proc(n);
    }
    public static void proc(int n){
        int [] fi = new int[90];
        fi[0] = 0;
        fi[1] = 1;
        System.out.print(fi[1]+" ");
        for(int i = 2; i <= n; i++){
            fi[i] = fi[i-1] + fi[i-2];
            System.out.print(fi[i]+"" + " ");
        }
    }
}
