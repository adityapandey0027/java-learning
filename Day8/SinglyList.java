class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyList {
    public static void main(String[] args) {
        Node head = null;
        SinglyList list = new SinglyList();
        // Assign the returned head back to the local head variable
        head = list.insertAtBegin(head, 10); 
        list.printList(head);

		head = list.insertAtBegin(head, 20); 
       	 list.printList(head);

    		head = list.insertAtBegin(head, 30); 
        list.printList(head);
    }

    // Return the new head node
    public Node insertAtBegin(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head; // Return the updated head
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
			String data;
			if (temp.next != null) {
    				data = temp.data + " -> ";
			} else {
    				data = temp.data + ""; // or simply data = temp.data;
			}

            System.out.print(data);
		
            temp = temp.next;
        }
    }
}
