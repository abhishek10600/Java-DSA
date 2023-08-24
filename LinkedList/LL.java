class LL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add element to the first of list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add element to the last of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete the first element in the linked list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        head = head.next;
    }

    // delete the last element in the linked list
    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // traversing a linked list
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}