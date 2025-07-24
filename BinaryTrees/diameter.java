package BinaryTrees;

public class diameter {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int heightOfTree(Node root){
        int lh,rh;
        if(root==null){
            return 0;
        }
        lh=heightOfTree(root.left);//calculate left tree height
        rh=heightOfTree(root.right); //calculate right tree height
        return Math.max(lh, rh)+1; //left sub tree + rightsub tree + root
    }

    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int LDiam=Diameter(root.left);
        int Lheight=heightOfTree(root.left);
        int RDiam=Diameter(root.right);
        int Rheight=heightOfTree(root.right);

        int selfDiam=Lheight+Rheight+1; //the path passes through the root
        return Math.max(selfDiam,Math.max(RDiam, LDiam));

    }

    public static void main(String args[]){
        //       1
        //     /   \
        //    2     3
        //   / \   /  \
        //  4   5 6    7

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(Diameter(root));
    }
}
