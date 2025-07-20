package BinaryTrees;

public class Height {
    static class Node{
        Node Left;
        Node Right;
        int data;
        Node(int data){
            this.data=data;
            this.Left=null;
            this.Right=null;
        }
    }

    public static int heightOfTree(Node root){
        int lh,rh;
        if(root==null){
            return 0;
        }
        lh=heightOfTree(root.Left);//calculate left tree height
        rh=heightOfTree(root.Right); //calculate right tree height
        return Math.max(lh, rh)+1;
    }

    public static int calfNode(Node root){
        int lNode,rNode;
        if(root==null){
            return 0;
        }
        lNode=calfNode(root.Left);
        rNode=calfNode(root.Right);
        return rNode+lNode+1;
    }
    public static int sumNode(Node root){
        int LefSum,RigSum;
        if(root== null){
            return 0;
        }
        LefSum=sumNode(root.Left);
        RigSum=sumNode(root.Right);
        return LefSum+RigSum+root.data;
    }
    public static void main(String args[]){
        //       1
        //     /   \
        //    2     3
        //   / \   /  \
        //  4   5 6    7

        Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
        root.Right.Left=new Node(6);
        root.Right.Right=new Node(7);
        System.out.println("height of a tree:-"+heightOfTree(root));
        System.out.println("no. of node in tree:-"+calfNode(root));
        System.out.println("sum of each node in tree:-"+sumNode(root));

    }
}
