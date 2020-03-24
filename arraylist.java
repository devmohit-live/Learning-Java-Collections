import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// import java.util.Scanner;

public class arraylist {
    public static void main(final String[] args) {
        // final Scanner sc = new Scanner(System.in);
        List<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(1);
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(5);
        linkedlist.add(6);
        linkedlist.add(7);
        // adding linkedlist to arraylist(extending array list) this is possile because
        // we have not explicitlly defined
        // the arraylist and linkedlist we have just called their constructor we have
        // defined them as Lists only
        // so as to make the type conversion easy
        intlist.addAll(linkedlist);
        intlist.add(1, 8); // adding 8 to index 1

        // for each loop ==>

        for (int i : intlist) {
            System.out.println(i);
        }
    }
}