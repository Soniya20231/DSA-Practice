package HashMap;
import java.util.*;
public class maxOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,8,1,9,1,1,1};
        //int n=2;
       HashMap<Integer,Integer> map=new HashMap<>(); 
       for(int i=0;i<arr.length-1;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       } 

       //for iterarting Hashmap
       Set<Integer> mapSet=map.keySet();
       for(int key:mapSet){
            if(map.get(key)>=2){
                System.out.println("key:-"+key+"  value:-"+map.get(key));
            }
       }

    }
}
