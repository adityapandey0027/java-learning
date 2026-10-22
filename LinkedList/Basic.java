import java.util.*;
import java.io.*;
//import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class Basic {
    public static void main(String[] args) throws IOException {
        Node head = createList();

        printList(head);
    }

    static Node createList() throws IOException {
        Node head = null;
        Node tail = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size");
        int n = Integer.parseInt(br.readLine());

        int idx = 0;
        while (idx < n) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens() && idx < n) {
                int num = Integer.parseInt(st.nextToken());
                Node temp = new Node(num);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
                idx++;
            }
        }

        return head;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }
}
