package DataStructures.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    int indx=-1;
    public Node buildTree(int[] root){
        indx++;
        if(root[indx]==-1){
            return null;
        }

        Node nNode = new Node(root[indx]);
        nNode.left=buildTree(root);
        nNode.right = buildTree(root);

        return nNode;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
}

public class Creation {
    public static void main(String[] args) {
        int[] root = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b = new BinaryTree();
        Node r = b.buildTree(root);
        System.out.println("Pre");
        BinaryTree.preOrder(r);
        System.out.println();
        System.out.println("In");
        BinaryTree.inOrder(r);
        System.out.println();
        System.out.println("Post");
        BinaryTree.postOrder(r);
        System.out.println();
        System.out.println("Level");
        BinaryTree.levelOrder(r);
//        System.out.println(r.data);
//        System.out.println(r.left.data);
//        System.out.println(r.right.data);
//        Node n = new Node(root);
    }
}
