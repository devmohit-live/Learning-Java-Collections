import java.util.ArrayList;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class hashSet {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(3);

        float lf = (float) 0.90;
        System.out.println(lf);
        int cap = 25;
        // constructors 4 :=>
        HashSet<Integer> h = new HashSet<>(); // cap=16,fillratio=0.75
        HashSet<Integer> h1 = new HashSet<>(10); // initial cap =10,fillratio=0.75
        HashSet<Integer> h2 = new HashSet<>(cap, lf); // initial cap =10,fillratio=0.9
        HashSet<Integer> h3 = new HashSet<>(a); // from collection a interconversion

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(10);
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        h1.add(10);
        h2.add(10);
        h2.add(20);
        h2.add(30);
        h2.add(40);
        h2.add(10);

        System.out.println("hashset 1 " + h);
        System.out.println("hashset 2 " + h1);
        System.out.println("hashset 3 " + h2);
        System.out.println("hashset 2 " + h3);

        System.out.println("the add method is of boolean type returns fasle of you try to add a duplicate element");
        System.out.println("Adding 10(duplicate) =>  " + h.add(10));

    }
}