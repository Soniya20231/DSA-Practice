//Print Nth fibbonachi number
package Easy;

public class fibbonachi {
    public static int Fibb(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        int num1=Fibb(num-1);
        int num2=Fibb(num-2);
        int f=num1+num2;
        return f;
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(Fibb(num));

    }
}
