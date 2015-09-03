/**
 * Created by Thync on 9/2/2015.
 */
public class Cau_9 {
    public static int [] arr = new int[8];
    public static int [] boso = {2, 3, 5, 7};
    public static void main(String[] args) {
        Try(0);
    }
    // So co tat ca cac chu so la so nguyen to;
    public static void Try(int i){
        for(int j = 0; j < 4; j++){
            arr[i] = boso[j];
            if(i == 6){
                proc();
            } else Try(i + 1);
        }
    }
    public static void proc(){
        int temp = 0;
        for(int i = 0; i < 7; i++){
            temp = temp*10 + arr[i];
        }
        if(Nt(temp) && Nt(Reserve(temp))) {
            System.out.println(temp);
        }
    }
    // So nguyen to;
    public static boolean Nt(int n){
        int check = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                check = 0;
            }
        }
        if(check == 1){
            return true;
        } else return false;
    }
    // So ma dao cua no cung la so nguyen to;
    public static int Reserve(int n){
        int rev = n/1000000
                + ((n/100000)%10)*10
                + ((n/10000)%10)*100
                + ((n/1000)%10)*1000
                + ((n/100)%10)*10000
                + ((n/10)%10)*100000
                + (n%10)*1000000;
        return rev;
    }
}
