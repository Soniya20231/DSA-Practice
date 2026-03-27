package bit_manupulation;
import java.util.*;
public class countSetBit {
    public static int CountBit(int num){
        int setCount=0;
        while(num>0){
            if((num & 1)==1){
                setCount++;
            
            }
            num =num>>1; //right Shift
        }
        return setCount;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("eneter the num");
        int num=sc.nextInt();
        int total=0;
        for(int i=1;i<=num;i++){
            total=total+CountBit(i);
        }
        System.out.println(total);
    }
}
