//Write a Java program that takes input from the user to create a LinkedList of 
//strings and thenremoves all the elements of the LinkedList that are less than or 
//equal to a given string
package LinkedList;

import java.util.*;

 public class remove {
//     public static class Node{
//         String data;
//         Node next;

//         public Node(String data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;

//     public static void addList(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public static void printList(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"----->");
//             temp=temp.next;
//         }
//         return;
//     }

    // public static void removeList(String str){
    //     Node temp2=head;
    //     while(temp2!=null){
    //         if(str.compareTo(temp2.data)<=0){
    //             temp2=temp2.next;
    //         }
    //     }
    //     printList();
    // }
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();          
        //List<String> list = new ArrayList<>();
        LinkedList<String> list=new LinkedList<>();
    //    list.add("kiwi");
    //    list.add("cherry");
    //    list.add("banana");
    //    list.add("apple");
        list.add("hi");
        list.add("hello");
        list.add("pune");
        list.add("hellohello");
        list.add("Punjab");

        String compareStr = "Punjab" ;

        for (String str : list) {
            if (str.compareTo(compareStr) >= 0) {
                System.out.print(str + " ");
            }
        }

    }
}
