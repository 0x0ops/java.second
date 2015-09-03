/**
 * Created by Thync on 9/2/2015.
 */
import java.util.Scanner;

public class Cau_9 {
    public static int [] arr = new int[8];
    public static int [] boso = {2, 3, 5, 7};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap yeu cau so co 7 chu so la: " +
                "\n\t 1. So nguyen to" +
                "\n\t 2. Tat ca cac chu so la so nguyen to" +
                "\n\t 3. Dao cua no cung la so nguyen to\n" +
                "Lua chon: ");
        int choose = scan.nextInt();
        switch (choose){
            case 1 :
                NgTo();
                break;
            case 2 :
                CsNt();
                break;
            case 3:
                Dao();
                break;
        }
    }
    // So nguyen to;
    public static void NgTo(){
        for(int i = 1000000; i < 10000000; i++){
            if(Nt(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean Nt(int x){
        int check = 1;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0){
                check = 0;
            }
        }
        if(check == 1){
            return true;
        } else return false;
    }
    // So co tat ca cac chu so la so nguyen to;
    public static void CsNt(){
        Try(0);
    }
    public static void Try(int i){
        for(int j = 0; j < 4; j++){
            arr[i] = boso[j];
            if(i == 6){
                print();
            } else Try(i + 1);
        }
    }
    public static void print(){
        for(int i = 0; i < 7; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    // So ma dao cua no cung la so nguyen to;
    public static void Dao(){
        int temp = 0;
        for(int i = 1000000; i < 10000000; i++){
            if(Nt(i)){
                temp = (i/1000000 + ((i/100000)%10)*10 + ((i/10000)%10)*100 + ((i/1000)%10)*1000 + ((i/100)%10)*10000 + ((i/10)%10)*100000 + (i%10)*1000000);
                if(Nt(temp)){
                    System.out.println(i);
                }
            }
        }
    }
}
