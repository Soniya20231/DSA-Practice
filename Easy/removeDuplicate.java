//Imagine you are developing a text processing tool, and you need to implement a 
//Java programthat removes duplicate characters from a given input string. 
//Write a program that takes userinput for a string and uses recursion to remove duplicate characters.
//The user should enter a string that they want to process, 
//and the program will removeconsecutive duplicate characters from this input string.
package Easy;

public class removeDuplicate {
    public static StringBuilder remString(String str ,StringBuilder newStr,int idx){
        if(str.length()<=idx){
            return newStr;
        }
        if(newStr.length()==0||str.charAt(idx)!=newStr.charAt(newStr.length()-1)){
            newStr.append(str.charAt(idx));
            //return remString(str, newStr, idx+1);
        }
            return remString(str, newStr, idx+1);
    }
    public static void main(String args[]){
        String str="aaaaaabghfu";
        StringBuilder st=new StringBuilder();
        System.out.println(remString(str, st, 0));

    }
}
