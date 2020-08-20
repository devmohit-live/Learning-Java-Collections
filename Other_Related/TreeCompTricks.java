import java.util.Comparator;
import java.util.TreeSet;

//Tricks:

//Adding duplicates elements=> can be usefull when want to use other treeSet propertois but allowing duplicates
//Common sorting ways => ascending and descending
// Want to preserve insertion order
// Want to reverse insertion order
public class TreeCompTricks {
    public static void main(String[] args) {
        TreeSet<Integer> t0 = new TreeSet<>(new Asc()); // similar to default
        t0.add(10);
        t0.add(15);
        t0.add(0);
        t0.add(20);
        t0.add(20);
        TreeSet<Integer> t1 = new TreeSet<>(new Dsc());
        t1.add(10);
        t1.add(15);
        t1.add(0);
        t1.add(20);
        t1.add(20);
        TreeSet<Integer> t2 = new TreeSet<>(new Ins());
        t2.add(10);
        t2.add(15);
        t2.add(0);
        t2.add(20);
        t2.add(20);
        TreeSet<Integer> t3 = new TreeSet<>(new RInsc());
        t3.add(10);
        t3.add(15);
        t3.add(0);
        t3.add(20);
        t3.add(20);
        TreeSet<Integer> t4 = new TreeSet<>(new Only1());
        t4.add(10);
        t4.add(15);
        t4.add(0);
        t4.add(20);
        t4.add(20);
        System.out.println("Original elemets : 10,15,0,20,20");
        System.out.println("Tree 1 : " + t0);
        System.out.println("Tree 2 : " + t1);
        System.out.println("Tree 3 : " + t2);
        System.out.println("Tree 4 : " + t3);
        System.out.println("Tree 5 : " + t4);
    }
}

// Ascending => return a.compareTo(b) //bydefault
// Descending => return -a.compareTo(b)

// In preserving or reversing insertion order duplicates aren't removed

// Preserve insertion order => return +1
// Reverse insertion order => return -1

// Return only first element

class Asc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        return a.compareTo(b);

    }
}

class Dsc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        return -a.compareTo(b);

    }
}

class Ins implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        return -1;

    }
}

class RInsc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        return +1;

    }
}

class Only1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        return 0;

    }
}
