/**
 * Created by Thync on 9/1/2015.
 */
import java.util.Scanner;

public class Cau_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        proc(n);
    }
    public static void proc(int a){
        int count = 0;
        int i = 2;
        while(count < a){
            int check = 1;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    check = 0;
                    break;
                }
            }
            if(check == 1){
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
    }

}
