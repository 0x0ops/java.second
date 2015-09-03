/**
 * Created by Thync on 9/1/2015.
 */
public class Cau_5 {
    public static void main(String [] args){
        proc();
    }
    public static void proc(){
        for(int i = 100000; i <= 999999; i++){
            int head = i/1000;
            int foot = i%1000;
            if(check(head, foot) == 1){
                System.out.print(i+" ");
            }
        }
    }
    public static int check(int a, int b){
        int temp = (b%10)*100+(((b/10)%10)*10) + b/100;
        if(temp == a){
            return 1;
        }else return 0;
    }
}
