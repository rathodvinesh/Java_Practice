package DataStructures.BinaryTree;

//import java.util.Stack;
//
//public class PreorderStack {
//
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    static class BTree {
//        static int indx = -1;
//
//        // Build the tree using preorder array representation
//        public static Node buildTree(int[] root) {
//            indx++;
//            if ( root[indx] == -1) {
//                return null;
//            }
//            Node newNode = new Node(root[indx]);
//            newNode.left = buildTree(root);
//            newNode.right = buildTree(root);
//            return newNode;
//        }
//
//        // Preorder traversal using a stack
//        public static void preorder(Node root) {
//            if(root==null){
//                return;
//            }
//
//            Stack<Node> st = new Stack<>();
//            st.push(root);
//
//            while(!st.isEmpty()){
//                Node curr = st.pop();
//                System.out.print(curr.data+" ");
//
//                if(curr.right!=null){
//                    st.push(curr.right);
//                }
//                if(curr.left!=null){
//                    st.push(curr.left);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] r = {1, 2, 4, -1, -1, 5, 6, -1, -1, 7, -1, -1, 3, -1, 8, -1, -1};
//        Node root = BTree.buildTree(r); // Build the tree
//        System.out.println("Preorder Traversal:");
//        BTree.preorder(root); // Perform preorder traversal
//    }
//}

//
import java.util.Stack;

public class PreorderStack {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left =null;
            this.right=null;
        }
    }

    static class BTree{
        static int indx=-1;
        public static Node buildTree(int[] root) {
            indx++;
            if (indx >= root.length || root[indx] == -1) {
                return null;
            }
            Node newNode = new Node(root[indx]);
            newNode.left = buildTree(root);
            newNode.right = buildTree(root);
            return newNode;
        }

        public static void preorder(Node root) {
            if(root==null){
                return;
            }

            Stack<Node> st = new Stack<>();
            st.push(root);

            while(!st.isEmpty()){
                Node curr = st.pop();
                System.out.print(curr.data+" ");

                if(curr.right!=null){
                    st.push(curr.right);
                }
                if(curr.left!=null){
                    st.push(curr.left);
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] r={1,2,3,4,5,-1,8,-1,-1,6,7,9};
        Node root =  BTree.buildTree(r);
        BTree.preorder(root);
//       PreorderStack.preOrder(r);
    }
}
