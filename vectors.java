import java.util.ArrayList;
import java.util.Vector;

class vectors {
    public static void main(String[] args) {
        // vector is a legacy class
        // constructors
        Vector<Integer> v = new Vector<>(); // initial cap =10
        Vector<Integer> v1 = new Vector<>(20); // int initial_cap =20
        Vector<Integer> v2 = new Vector<>(20, 5); // int initial_cap =20, incremental_cap=5
        // bydefault incremental cap is 2*initialcap
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        Vector<Integer> v3 = new Vector<>(ar); // from Collection c

        // vector uses old/legacy methods/methodnames like addElement() but new names
        // like add can also be used
        v.addElement(1);
        v1.add(2);
        System.out.println("Size of 4th vectors is " + v3.size());
        v2.addElement(5);
        v2.add(6);
        v2.add(7);
        v2.addElement(23);
        v2.removeElement(6);
        v2.add(55);
        v2.removeElementAt(1); // index
        v2.remove(1); // index
        Vector<String> vs = new Vector<>();
        vs.add("hey");
        vs.add("Hello");
        vs.add("YO");
        vs.remove("Hello"); // object but if inyeger is provided it will be taken as index
        System.out.println("First vector is " + v);
        System.out.println("Second vector is " + v1);
        System.out.println("Third vector is " + v2);
        System.out.println("Fourth vector is " + v3);
        System.out.println("String vector is " + vs);
    }
}