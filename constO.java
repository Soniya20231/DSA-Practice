import java.util.Scanner;

public class constO {
   
    public static void main(String[] args) {
        // String s="Mam";
        // int j=(s.length())-1;
        // int i=0;
        // int count=1;
        // while (i<=j) {
        //     if(s.charAt(i)!=s.charAt(j)){
        //         System.out.println("it is not a palindrome");
        //          count=0;
        //        }
        //        j--;
        //        i++;
            
        //     }
        //     if(count==1){
        //         System.out.println("it is  a palindrome");
        //     }

        // }
        System.out.println("eneter the no whoes table you want to print:- ");
        Scanner st=new Scanner(System.in);
        int n= st.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+"X"+i+"="+i*2);
        }
    }
}

