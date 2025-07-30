package Easy;

import java.util.*;

public class subStringOcc {

    public static ArrayList<Integer> Sub(String str, String target ,int idx, ArrayList<Integer> arr){

        if(idx>str.length()-target.length()){
            return arr;
        }
        if(str.startsWith(target,idx)){
            arr.add(idx);
        }
        return Sub(str, target, idx+1, arr);
    }
    public static void main(String args[]){
       ArrayList <Integer> li=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       li=Sub(str, "ab", 0, li);
       if(li.isEmpty()){
        System.out.println("-1");
       }
       else{
        System.out.println(li);
       }
    }
}
