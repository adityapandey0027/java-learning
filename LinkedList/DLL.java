class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {
    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        // createList(arr);
        // printList();

        //insert at head
        insertAtHead(23);
        insertAtHead(30);
        insertAtTail(45);
        insertAtHead(65);
        insertAtHead(24);
        insertAtTail(76);
        insertAtTail(100);
        printList();

    }

    static void createList(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            if (head == null && tail == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }
    }

    static void printList() {
        if (head == null)
            return;
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static void reverseDLL(){
        if(head == null || head.next == null) return;
        
        Node temp = head;

        while(temp != null){
            temp
        }



    }

    static void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    static void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = temp;
        }
    }

    static void insertAtIndex(int idx, int val) {
        if (idx == 1) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
        if (head == null) {
            System.out.println("Invalid list");
            return;
        }

        int count = 0;
        Node temp = head;
        while (temp.next != null) {
            count++;
            if (count == idx - 1)
                break;
            temp = temp.next;
        }
        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }
}
