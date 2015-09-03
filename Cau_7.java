/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        Us(n);
        System.out.print("\nCac uoc so nguyen to: ");
        UsNt(n);
    }
    // Uoc so;
    public static void Us(int n){
        int count = 0;
        System.out.print("Cac uoc so la: ");
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print("("+i+" "+n/i+") ");
                count = count +2;
            }
        }
        System.out.print("\nCo: " + count + " uoc so.");
    }
    //Uoc so nguyen to
    public static void UsNt(int n){
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                if(Nt(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static boolean Nt(int x){
        int check = 1;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x%i == 0){
                check = 0;
            }
        }
        if(check == 1){
            return true;
        } else return false;
    }
}
