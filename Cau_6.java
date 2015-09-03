/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scan.nextInt();
        System.out.print("Tong cac chu so n: "+sum(n));
        System.out.print("\nn: ");
        anal(n);
    }
    // Tong chu so cua n;
    public static int sum(int n){
        int s = 0;
        while(n > 0){
            s = s + n % 10;
            n = n/10;
        }
        return s;
    }
    // Phan tich n thanh cac thua so nguyen to;
    public static void anal(int n){
        int i = 2;
        while(n > 0){
            if(n % i == 0){
                System.out.print(i);
                n = n/i;
                if(n>1) {
                    System.out.print("x");
                }
            } else
                i++;
        }
    }
}
