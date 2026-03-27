package LinkedList;

public class mergeTwoSorted {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // public static Node head;
    // public static Node tail;

    public static Node mergeTwo(Node l1 ,Node l2){
        Node dummy=new Node(-1);
        Node current=dummy;
        while (l1!=null && l2!=null) {
            if(l1.data <= l2.data){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1!=null){
            current.next=l1;
        }
        else{
            current.next=l2;
        }

        return dummy.next;

    }
    public static void main(String[] args) {
        Node l1=new Node(1);
        l1.next=new Node(89);
        l1.next.next=new Node(90);

        Node l2=new Node(2);
        l2.next=new Node(43);
        l2.next.next=new Node(44);

        Node head=mergeTwo(l1, l2);

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");

    }
}
