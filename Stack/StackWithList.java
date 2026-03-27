package Stack;
import java.util.*;
public class StackWithList {
     static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;

     static class Stack{
        public static void Push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            newNode.next=head;
            head=newNode;
            System.out.println(data+" has been added");

        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.Push(34); 
    }
}
