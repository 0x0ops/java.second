/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap yeu cau: \n\t 1. So nguyen to\n\t 2. So thuan nghich\n\t 3. So co tong chu so chia het cho 10.\n" +
                         "Lua chon: ");
        int choose = scan.nextInt();
        switch (choose){
                case 1 :
                    Nt();
                    break;
                case 2 :
                    Tn();
                    break;
                case 3:
                    Ch();
                    break;
        }
    }
    // So nguyen to;
    public static void Nt(){
        for(int i = 10000; i < 10000000; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean check(int x){
        int c =1;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x%i == 0){
                c = 0;
            }
        }
        if(c == 1){
            return true;
        }else return false;
    }
    // So thuan nghich;
    public static void Tn(){
        int a,b,c,d,e,f;
        System.out.println("\nCac so thuan nghich co 5 den 7 chu so la: \n");
        for(int i = 10000; i<100000; i++){
            a = i/1000;
            b = i%100;
            if(a == b/10 + (b%10)*10){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int j = 100000; j < 1000000; j++) {
            c = j/1000;
            d = j%1000;
            if(c == d/100 + ((d/10)%10)*10 + (d%10)*100){
                System.out.print(j+" ");
            }
        }
        System.out.println();
        for(int k = 1000000; k < 10000000; k++){
            e = k/10000;
            f = k%1000;
            if(e == f/100 + ((f/10)%10)*10 + (f%10)*100){
                System.out.print(k+" ");
            }
        }
    }
    // So co tong chu so chia het cho 10;
    public static void Ch(){
        for(int i = 10000; i < 10000000; i++){
            if(chiahet(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean chiahet(int x){
        int sum = 0;
        while(x > 0){
            sum = sum + x%10;
            x = x/10;
        }
        if(sum % 10 == 0){
            return true;
        }else return false;
    }
}
