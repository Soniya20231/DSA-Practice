package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
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
        static int idx=-1;
        public static Node buildTree(int nodes[]){
           idx++;
           if(nodes[idx]==-1){
            return null;
           }

           Node newNode=new Node(nodes[idx]);
           newNode.Left=buildTree(nodes);
           newNode.Right=buildTree(nodes);
           return newNode;
        }

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
        
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println(); //print nextLine

                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }

                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.Left!=null){
                        q.add(currNode.Left);
                    }
                    if(currNode.Right!=null){
                        q.add(currNode.Right);
                    }
                    
                    
                }

            }
        }

    }

    public static void main(String[] args) {
         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
         //System.out.println(root.data);
         tree.levelOrder(root);
    }
}
