import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(52);
        ll.add(53);
        ll.add(54);
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        LinkedList frmar = new LinkedList<>(ar);

        // 6 methods of LinkedList :

        // addFirst
        ll.addFirst(100);
        // addLast
        ll.addLast(-999);
        // getFirst and getLast

        System.out.println("Linked Lists are as follows :");
        System.out.println("First: " + ll);
        System.out.println("Second: " + frmar);

        System.out.println("First Element : " + ll.getFirst());
        System.out.println("Last Element : " + ll.getLast());

        // remove first and last
        System.out.println("Removing first element " + ll.removeFirst());
        System.out.println("Removing Last element " + ll.removeLast());
        System.out.println("First Linked List : " + ll);
        System.out.println("Second Linked List : " + frmar);
    }

}