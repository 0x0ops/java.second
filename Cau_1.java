/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        print(n);
    }
    public static void print(int a){
        for (int i = 0; i < a; i++){
            for(int j = 1; j < a-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i+1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
