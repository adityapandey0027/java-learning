import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int data) {
        this.val = data;
        this.left = null;
        this.right = null;
    }

    
}
public class BST {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no nodes : ");
        int n = sc.nextInt();

        Node root = null;
        for(int i = 0; i<n; i++){
            root = buildTree(root, sc.nextInt());
        }
        printInOrder(root);

        sc.close();

    }

     static Node buildTree(Node root, int key){
        if(root == null){
            return new Node(key);
        }

        if(root.val > key){
            root.left = buildTree(root.left, key);
        }

        if(root.val < key){
            root.right = buildTree(root.right, key);
        }

        return root;
    }

     static void printInOrder(Node root){
        if(root == null) return ;

        printInOrder(root.left);

        System.out.print(root.val + " ");

        printInOrder(root.right);
    }
}
