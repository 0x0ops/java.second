/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scan.nextInt();
        int b;
        do{
            System.out.print("Nhap b: ");
            b = scan.nextInt();
        }while(b < a);
        proc(a,b);
    }
    public static void proc(int a, int b){
        for(int i = a; i < b; i++){
            for(int j = i+1; j<=b; j++){
                if(ucln(i,j) == 1){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static int ucln(int x, int y){
        while(y != 0){
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }
}
