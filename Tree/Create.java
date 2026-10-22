import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Pair{
    int idx;
    Node node;

    Pair(Node node, int idx){
        this.idx = idx;
        this.node = node;
    }
}

public class Create {
     static int idx = 0;
     static int maxWidth = 0;
     static int diameter = 0;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       
        int[] nodes = {1, 2, 4, 8, -1, -1, 9, -1, -1, 5, 10, -1, -1, 11, -1, -1, 3, 6, 12, -1, -1, 13, -1, -1, 7, 14, -1, -1, 15, -1, -1};

        Node root = buildTree(nodes);

        printPreorderTree(root);

        System.out.println();

        System.out.println("Height of Tree " + height(root));

        maxWidthTree(root);
        System.out.println("Maximum width of tree is : "+  maxWidth);

        diameterOfTree(root);

        System.out.println("Diameter of the tree is : "+ diameter);

        sc.close();

    }
    static Node buildTree(int [] nodes){
        if(idx >= nodes.length || nodes[idx] == -1) {
            idx++;
            return null;
        }
    
        Node root = new Node(nodes[idx]);
        idx++;

        root.left = buildTree(nodes);
        root.right = buildTree(nodes);

        return root;
    }

    static void  printPreorderTree(Node root){
        if(root == null) return ;

        System.out.print(root.val + " ");
        printPreorderTree(root.left);
    
        printPreorderTree(root.right);
    }

     static int height(Node root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

     static void maxWidthTree(Node root){
        if(root == null) return ;
        
        Deque<Pair> q = new ArrayDeque<>();
        q.addLast(new Pair(root, 0));

        while(!q.isEmpty()){
            int levelSize = q.size();
            int startIdx = q.getFirst().idx;
            int endIdx = q.getLast().idx;
            maxWidth = Math.max(maxWidth, endIdx - startIdx + 1);

            while(levelSize > 0){
                Pair temp = q.getFirst();
                q.removeFirst();
                if(temp.node.left != null){
                    q.addLast(new Pair(temp.node.left, temp.idx*2 + 1));
                }
                if(temp.node.right != null){
                    q.addLast(new Pair(temp.node.right, temp.idx * 2 + 2));
                }

                levelSize--;
            }
        }
    }

    // find diameter of the tree 
    static int diameterOfTree(Node root){
        if(root == null) return 0;

        int leftHieght = diameterOfTree(root.left);
        int rightHeight = diameterOfTree(root.right);

        diameter = Math.max(leftHieght + rightHeight, diameter);

        return Math.max(leftHieght, rightHeight) + 1;
    }

}
