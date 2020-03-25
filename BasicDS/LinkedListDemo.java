public class LinkedListDemo {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // a head node pointer

    boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    void add(int data) {
        // If linkedList is Empty , inserting first node
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
            return;
        }
        // inserting at last ; default way
        else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
        }
        return;
    }

    void removeByKey(int key) {
        Node tmp = head;
        // if list is empty
        if (isEmpty()) {
            System.out.println("Can't remove element from an empty list");
            return;
        }
        // if removinf first element
        if (tmp != null && tmp.data == key) {
            head = tmp.next; // move the head pointer to next node
        } else {
            Node prev = null;
            while (tmp != null) {
                if (tmp.data == key) {
                    prev.next = tmp.next;
                    return;
                }
                prev = tmp;
                tmp = tmp.next;
            }
            System.out.println("No key found!!");
        }
    }

    void printlist() {
        Node tmp = head;
        if (head == null)
            System.out.println("List is Empty");
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        System.out.println("Checking if if empty " + list.isEmpty());
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("printing list object " + list);
        System.out.println("Removing mid element (key=3)");
        list.removeByKey(3);
        list.printlist();
        System.out.println("Removing first element (key=7)");
        list.removeByKey(7);
        list.printlist();
    }
}