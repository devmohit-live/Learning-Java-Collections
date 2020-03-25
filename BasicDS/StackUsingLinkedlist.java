class StackUsingLinkedlist {
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

    void push(int data) {
        // If linkedList is Empty , inserting first node
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
            return;
        }
        // push ==> top of stack ie at (and this item will be removed first too)
        else {
            Node tmp = head;
            head = n;
            n.next = tmp;
        }
        return;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty ");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

    int pop() {
        Node tmp = head;
        // if list is empty
        if (isEmpty()) {
            System.out.println("Can't pop element from an empty stack");
            return Integer.MIN_VALUE;
        }
        // if remove the head element top
        head = head.next;
        return head.data;
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
        StackUsingLinkedlist s = new StackUsingLinkedlist();
        System.out.println("using peek function on empty stack");
        s.peek();
        System.out.println("Using pop function on empty stack");
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek : " + s.peek());
        s.push(4);
        s.push(5);
        System.out.println("Stack is : ");
        s.printlist();
        System.out.println("After performing two pops");
        s.pop();
        s.pop();
        System.out.println("Expected Output : 3,2,1");
        System.out.println("Actual Output : ");
        s.printlist();

    }
}