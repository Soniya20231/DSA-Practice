import java.util.*;
public class stringSubset {
     public static void subset(String str,String ans,int i){
         //base case

         if(i==str.length()){
             System.out.print(ans);
             return;
         }
        //recursion function
        //1.string wants to be a part of subset
        subset(str,ans+str.charAt(i),i+1);

         //2. string dont want to be part of substring
         subset(str,ans,i+1);
         }

    // public static void permutation(int str ,String ans){
    //     //base case
    //     if(str.length()==0){
    //         System.out.println(ans);
    //         return;

    //     }
    //     for(int i=0;i<str.length();i++){
    //         char curr=str.charAt(i);
    //         String newstr=str.substring(0,i)+str.substring(i+1);
    //         permutation(newstr,ans+curr);

    //     }

    // }

    public static void main(String arg[]){
        String str="abc";
        subset(str," ",0);
       //permutation(str," ");

    }
    
}
