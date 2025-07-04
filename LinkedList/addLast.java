package LinkedList;

public class addLast {
    public static class Node {
        int data;
        Node next;
        public Node (int data){
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

    public static void printList(){
        Node temp=head;
        while (temp!=null) {
            if(temp.next==null){
                System.out.print(temp.data+"---->null");
                break;
            }
            System.out.print(temp.data+"---->");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        AddLast(2);
        AddLast(5);
        AddLast(6);
        AddLast(7);
        printList();
    }
}
