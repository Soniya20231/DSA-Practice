package String;

public class StringPermutation {
    public static void Permutation(String str,StringBuilder newStr){
        //baseCase
        if(str.length()==0){
            System.out.println(newStr);
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //remove current charecter from string
            String newString=str.substring(0, i)+str.substring(i+1);
            Permutation(newString, newStr.append(curr));
        }
    }
    public static void main(String args[]){
        String str="abc";
    }
}
