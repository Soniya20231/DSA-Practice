package LinkedList;

public class Checkpalindrome {
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

    public static Node findmid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node Newhead){
        Node prev=null;
        Node curr=tail=Newhead;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
         Node Right=prev;
         return Right;
    }
    public static void main(String args[]){
        AddLast(2);
        AddLast(5);
        AddLast(5);
        AddLast(2);
        printList();
        System.out.println();
        Node Mid=findmid();
        Node Right=reverse(Mid);
        Node Left=head;
        int flag=0;
        while(Right!=null){
            if(Left.data!=Right.data){
                flag=1;
                System.out.println("Not a palindrom");
                break;
            }
            Right=Right.next;
            Left=Left.next;
        }
        if(flag==0){
            System.out.println("It is palindrom a palindrom");
        }
         // printList();
    }
  
}
