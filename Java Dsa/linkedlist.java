/*void deleteEnd(){
    if(head==null){
        System.out.println("empty");
        return;
    }
}*/
// Linked List insertion demo
/*class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist {
    Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {// this method is adds a new node at the front of the linked list
        Node newNode = new Node(data);// creates a new node with the given value
        newNode.next = head;//connects the new node to the current head (the old first node). If the list was empty,head is null,so the new node just points to null.
        head = newNode;/updates the head to this new node,making it the first element
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position (1-based index)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(25, 3); // Insert 25 at position 3
        list.insertAtBeginning(5);

        list.display();
    }
}*/
// Linked List deletion demo
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist {
    Node head;

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at specific position (1-based index)
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        temp.next = temp.next.next;
    }

    // Display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        // Insert some nodes manually
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Original list:");
        list.display();

        list.deleteAtBeginning();
        System.out.println("After deleting at beginning:");
        list.display();

        list.deleteAtEnd();
        System.out.println("After deleting at end:");
        list.display();

        list.deleteAtPosition(2);
        System.out.println("After deleting at position 2:");// the postion will start from 1 and 2 not from 0 as we have taken i=1
        list.display();
    }
}



