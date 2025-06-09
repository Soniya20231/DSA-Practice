import java.util.*;
public class operation_on_linkedList {
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

    public static void addelement(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;

    }
    public static Node reverse(Node midd){
        Node prev=null;
        Node curr=midd;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    public static void pr(){
        Node temp=head;
        while (temp!=null) {
            if(temp.next==null){
                System.err.print(temp.data);
                temp=temp.next;
            }
            else{
            System.err.print(temp.data+"-->");
            temp=temp.next;
            }

            
        }
        System.out.println();
    }
    public static void Ndelete(int n){
        Node temp=head;
        int size=0;
        //to calculate size
        while(temp!=null){
            temp=temp.next;
            size=size+1;
        }
        if(n==size){
            head=head.next;//remove first node
        }
        int i=1;
        int index=size-n;//
        Node prev=head;
        while(i<index){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
    }
    public static Node  middle(Node Head){
        Node slow=Head;
        Node fast=Head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }
    public static boolean palindrom(){
        //find out he middle
        Node midd=middle(head);
        //revere thr right half
        Node right=reverse(midd);
        Node left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;

            }
            right=right.next;
            left=left.next;
        }
        return true;


    }


    public static void main(String args[]){
        LinkedList l=new LinkedList();
        addelement(3);
        addelement(6);
        addelement(8);
        addelement(20);
        addelement(8);
        addelement(6);
        addelement(3);
        pr();
        if(palindrom()){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not a palindrom");
        }
        
        // System.out.println();
        // Ndelete(5);
        // pr();

        

    }
    
}
