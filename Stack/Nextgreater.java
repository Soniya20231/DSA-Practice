
package Stack;
import java.util.*;
public class Nextgreater {

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int Nextlarge[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[i]>s.peek()){
                s.pop();
            }

            if(s.isEmpty()){
                Nextlarge[i]=-1;
            }
            else{
                Nextlarge[i]=s.peek();
            }
            s.push(arr[i]);
        }

        for(int i=0;i<=arr.length-1;i++){
            System.out.println(Nextlarge[i]);
        }

    }
}
