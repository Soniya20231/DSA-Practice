package Stack;
import java.util.*;
public class addBottom {
    public static void addAtBootom(int data,Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top =st.pop();
        addAtBootom(data, st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
       // System.out.println("hello");
     st.push(1);
     st.push(2);
     st.push(3);


    }
}
