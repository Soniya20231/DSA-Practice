//import java.util.*;
public class met {
    public static void main(String args[]){
        Mew m1= new Mew(10, 20);
        m1.addition();
        m1.remainder();
    }
    
    }
class Mew{
        int a,b;
        Mew(int x,int y){
            a=x;
            b=y;
        }
        public void addition(){
            System.out.println(a+b);

        }
        public void remainder(){
            System.out.println(a%b);

        }
    }

    
    
    

