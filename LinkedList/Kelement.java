//Kth Element from last Linked List Given a linked list with n nodes. 
package LinkedList;

import java.util.Scanner;

public class Kelement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addList(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter values of node");
        while(true){
            int data=sc.nextInt();
            if(data==-1){
                break;
            }
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static void PrintList(){
        Node temp=head;
        if(head==null){
            System.out.print("null");
        }
        while(temp!=null){
            System.out.print(temp.data+"---->");
            temp=temp.next;
        }
        System.out.println("-1");
    }

    public static Node findNthNode(int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String args[]){
        addList();
        PrintList();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for k");
        int num=sc.nextInt();
        System.out.print("last Kth element from linkedList"+findNthNode(num).data);
    }
}
