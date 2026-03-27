package Easy;

public class pattern {
    
    public static void main(String args[]){
        int b=0;
        for(int i=5;i>=1;i--){
             b += 1;
            for(int j=1;j<=i;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
