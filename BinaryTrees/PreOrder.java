package BinaryTrees;
//O(n)
import java.util.*;
public class PreOrder {
     static class Node{
        int data;
        Node Left;
        Node Right;
        
        Node(int data){
            this.data=data;
            this.Left=null;
            this.Right=null;
        }

    }
    static class BinaryTree{
        static int idx =-1;
        public static Node builTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.Left=builTree(nodes);
            newNode.Right=builTree(nodes);
            return newNode;
        }
        
        public static void PreOrderTravel(Node root){
        if(root==null){
            System.out.print("-1  ");
            return;
        }
        System.out.print(root.data+" ");
        PreOrderTravel(root.Left);
        PreOrderTravel(root.Right);
    }
    public static void PostOrder(Node root){
        if(root==null){
            //System.out.print("-1 ");
            return ;
        }
        PostOrder(root.Left);
        PostOrder(root.Right);
        System.out.print(root.data+" ");
    }
    public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.Left);
        System.out.print(root.data+" ");
        InOrder(root.Right);
    }

    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(nodes);
        //System.out.println(root.data);
        //tree.PreOrderTravel(root);
        //tree.PostOrder(root);
        tree.InOrder(root);
    }
}
