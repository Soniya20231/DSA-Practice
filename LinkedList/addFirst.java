package LinkedList;

//import java.util.LinkedList;

public class addFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
    public static Node tail;

    public static void addFirst1(int data){
        Node newNode=new Node(data);
        if( head == null){
            head= tail = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
        return;
    }
    public static void printlist(){
        Node temp2=head;
        while(temp2!=null){
            System.out.print(temp2.data+"-->");
            temp2=temp2.next;
        }
        System.out.print("null");

    }
    public static void main(String args[]){
        //LinkedList li=new LinkedList();
       // li.add(23);
        addFirst1(3);
        //addFirst(34);
        addFirst1(2);
        printlist();
    }
}
