package Queue;
import java.util.*;
public class twoStack {
    public static class Queue{
        
        Stack <Integer> st1=new Stack<>();
        Stack <Integer> st2=new Stack<>();

        public void add(int data){

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st1.push(data);
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }

        public void remove(){
            System.out.println(st1.pop());
        }

        public void print(){
            while(!st1.isEmpty()){
                System.out.print(st1.pop()+" ");     
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        //q.print();
        System.out.println("the element is removed from front");
        q.remove();

        
    }
}
