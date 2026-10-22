import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    Node(int v){
        this.val = v;
        this.left = null;
        this.right = null;
    }
}
class BSTIteretor{
    Stack<Node> st = new Stack<>();

    public BSTIteretor(Node root) {

        while(root != null){
            st.push(root);
            root = root.left;
        }
    }
    int next(){
        Node top = st.peek();

        Node temp = top.right;

        while(temp != null){
            st.push(temp);
            temp = temp.left;
        }

        return top.val;
    }
    boolean hasNext(){
        return !st.isEmpty();
    }

    
}
public class InvertB {
    public static void main(String [] args){
        int [] nodes = {6, 4, 8, 1, 5, 7, 9};

        Node root = builTree(nodes, 0);

        // System.out.println("Before Invert tree");
        // printTree(root);
        // System.out.println();


        // Node invertRoot = invertTree(root);
        // System.out.println("After Inverting tree");
        // printTree(invertRoot);

        int [] arr = new int[2];

        int key = 3;
        
        getInPredInSucc(root, arr, key);

        System.out.println("InOrder predecessor" + arr[0]);
        System.out.println("In order successor "+ arr[1]);


    }

    static Node builTree(int [] nodes , int idx){
        if(idx >= nodes.length){
            return null;
        }


        Node root = new Node(nodes[idx]);

        root.left = builTree(nodes, idx * 2 +1);
        root.right = builTree(nodes, idx * 2 +2);
        
        return root;
    }
    static Node invertTree(Node root){
        if(root == null) return null;

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;

    }
    static void printTree(Node root){
        if(root == null) return ;

        System.out.print(root.val + " ");

        printTree(root.left);
        printTree(root.right);
    }
    static void getInPredInSucc(Node root, int [] arr, int key){
        if(root == null) return ;

        if(key > root.val){
            arr[1] = root.val;
            getInPredInSucc(root.right, arr, key);
        }else if(key < root.val){
            arr[0] = root.val;
            getInPredInSucc(root.left, arr, key);
        }else{
            // key == root.val

            // find predicessor
            Node temp = root.left;

            while(temp != null){
                arr[0] = temp.val;
                temp = temp.right;
            }

            // find successor
            temp = root.right;

            while(temp != null){
                arr[1] = temp.val;
                temp = temp.left;
            }

        }
    }
}
