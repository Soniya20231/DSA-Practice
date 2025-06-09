import java.util.*;

public class linked_list {
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

     public static void addFirst(int data){
         Node newnode=new Node(data);
         if(head==null){
             head=tail=newnode;
             return;
         }
        
         newnode.next=head;
         head =newnode;
         return;
     }
    public static void addlast(int data){
        Node newnNode=new Node(data);
        if(head==null){
            head=tail=newnNode;
            return;

        }
        tail.next=newnNode;
        tail=newnNode;
    }

     public static void addMiddle(int data,int idx){
         Node newnode1=new Node(data);
         Node temp=head;
         int i=0;
         while(i<idx-2){
             temp=temp.next;
             i++;
         }
         newnode1.next=temp.next;
         temp.next=newnode1;

     }
    public static int removeLast(int size){
        if(head.next==null){
            int value=head.data;
            head=tail=null;
            return value;
        }
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        int v=temp.next.data;
        temp.next=null;
        tail=temp;
        return v;


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
        LinkedList li=new LinkedList();
        
         addlast(1);
         addlast(2);
         addlast(3);
         addlast(4);
         addlast(5);
         addlast(6);
         printlist();
         System.out.println();
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your choice:-\n1.add in middle\n2. remove last\n3.add first");
         int ch=sc.nextInt();
         if(ch==1){
            System.out.println();
         addMiddle(9, 5);
          printlist();

         }
         if (ch==2){
            System.out.println("the value deleted is"+removeLast(6)) ;
            printlist();
         }
         if(ch==3){
            addFirst(1);
            addFirst(2);
            addFirst(3);

         }
        
        

    }
}
    

