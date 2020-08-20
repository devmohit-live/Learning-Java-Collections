import java.util.Comparator;
import java.util.TreeSet;

import sun.reflect.generics.tree.Tree;

// Customizing to sort in decreasing order

// Integer Implementation using relational operators
class IntComparator implements Comparator {
    public int compare(Object x, Object y) {
        Integer a = (Integer) x;
        Integer b = (Integer) y;
        if (a > b)
            return -1;
        else if (b > a)
            return +1;
        else
            return 0;
    }
}

// Using CompareTo method of Comparable Interface(Preferred as String can't be
// compared with relational operators)

// By-default Comparable return {+1,-1,0} if the first item in =>
// item1.compareTo(item2)
// {is_to_be_appended_after => item2,item} {is_to_be_appended_before =>
// item1,item2}
// or are equal to be inserted on same place respectively

// We can either change it from item1.compareTo(item2) to ==>
// item2.compareto(item1) OR
// just simply return -1* item1.compareTo(item2)

class StrComparatorByNegative implements Comparator {
    public int compare(Object x, Object y) {
        String a = x.toString();
        String b = y.toString();
        return -1 * a.compareTo(b);
    }
}

class StrComparatorByRev implements Comparator {
    public int compare(Object x, Object y) {
        String a = x.toString();
        String b = y.toString();
        return b.compareTo(a);
    }
}

public class MyComparator {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new IntComparator()); // no duplicates
        t.add(15);
        t.add(50);
        t.add(1);
        t.add(5);
        t.add(15);
        t.add(4);
        System.out.println("Integer tree " + t);

        TreeSet<String> st1 = new TreeSet<>(new StrComparatorByNegative());
        st1.add("A");
        st1.add("B");
        st1.add("a");
        st1.add("b");
        st1.add("ABC");
        st1.add("ADGH");
        st1.add("ABC");
        st1.add("xs");

        TreeSet<String> st2 = new TreeSet<>(new StrComparatorByRev());
        st2.add("A");
        st2.add("B");
        st2.add("a");
        st2.add("b");
        st2.add("ABC");
        st2.add("ADGH");
        st2.add("ABC");
        st2.add("xs");

        System.out.println("Tree using NegativeComp  " + t);
        System.out.println("Tree using RevComp  " + t);
    }
}
