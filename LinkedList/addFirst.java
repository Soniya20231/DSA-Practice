package LinkedList;

import java.util.Scanner;

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
    public static void Searchkey(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Key is present in the linkedList");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Key is not present in the linkedList");
    }
    public static void main(String args[]){
        //LinkedList li=new LinkedList();
       // li.add(23);
        addFirst1(3);
        addFirst1(34);
        addFirst1(2);
        addFirst1(8);
        addFirst1(10);
        printlist();
         System.out.println("");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key to found");
        int key=sc.nextInt();
        Searchkey(key);
    }
}
