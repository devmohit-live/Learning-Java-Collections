import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
// import java.util.Scanner;

public class arraylist {
    public static void main(final String[] args) {
        // default cap =10
        List<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(100);
        intlist.add(100);
        intlist.add(100);
        intlist.add(500);
        intlist.add(800);
        intlist.add(500);
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
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(500);
        arr.add(800);
        // for each loop ==>

        for (int i : intlist) {
            System.out.println(i);
        }

        // other basic functions
        System.out.println("get at pos 2 : " + intlist.get(2));
        System.out.println("isEmpty " + intlist.isEmpty());
        System.out.println("contains return boolean " + intlist.contains(1));
        System.out.println("remove element at index 2 " + intlist.remove(2));
        System.out.println("size (to get length) " + intlist.size());
        System.out.println("removeAll to remove iterables " + intlist.removeAll(arr));
        // converting to array
        // by default toArray gives array of Object data type
        Object ob[] = intlist.toArray();
        System.out.println("Object array : =");
        for (Object i : ob) {
            System.out.println(i);
        }
        // to get the array in desired dataype we pass the object of that data type as
        // parameter after creating the object of that data type
        Integer obj[] = new Integer[intlist.size()];
        intlist.toArray(obj);
        System.out.println("Ineteger Array");
        for (Integer i : obj) {
            System.out.println(i);
        }

        // Other Construcutors:

        // ArrayList<Generic> ob=new ArrayList(int initial_limit)
        ArrayList<Integer> ob1 = new ArrayList(20);
        // System.out.println("Size of ob1 is " + ob1.size());
        for (int i = 0; i < 10; i++) {
            ob1.add(i);
        }
        // System.out.println("Size now of ob1 is " + ob1.size());
        System.out.println(ob1);

        // ArrayList<Generic> ob=new ArrayList(Collection c);
        ArrayList<Integer> ob2 = new ArrayList(linkedlist);
        System.out.println(ob2);

    }
}