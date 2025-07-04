package LinkedList;

public class ReverseList {
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

    public static void AddLast(int num){
        Node newNode= new Node(num);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public static void Reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        AddLast(1);
        AddLast(2);
        AddLast(3);
        AddLast(4);
        AddLast(5);
        printList();
        Reverse();
        printList();

    }
}
