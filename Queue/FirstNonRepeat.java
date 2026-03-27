package Queue;
import java.util.*;
public class FirstNonRepeat {
    public static void NonReapeat(String str){
        Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            q.add(str.charAt(i));
            freq[str.charAt(i)-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(q.peek());
            }
           
        }
    }
    public static void main(String[] args) {
        String str="aabccxb";
        NonReapeat(str);
    }
}
