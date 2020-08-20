import java.util.Comparator;
import java.util.TreeSet;

/*
Solve the strings such that the string return orders must follow the certain condtitions:
1> must appear in descending order of their length
2> if two strings have same length they must appear in lexographically order
3> There should'nt be any duplicate string

Sorting order is used and no duplicates => TreeSet


*/

class Question {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new Mycomparator());
        t.add("A");
        t.add("ABC");
        t.add("AA");
        t.add("XX");
        t.add("XXX");
        t.add("XXXX");
        t.add("ABCD");
        t.add("ACBD");
        t.add("ADBC");
        t.add("A");

        System.out.println(t);
    }
}

class Mycomparator implements Comparator {
    public int compare(Object o1, Object o2) {
        String a = o1.toString();
        String b = o2.toString();

        // int l1=a.length(); primitive types like int,float can't use compareTo() use
        // Wrappers only
        Integer l1 = a.length();
        Integer l2 = b.length();

        // return acc to length-wise in decreasing order
        if (l1 > l2)
            return 1; // +ve l1 must be addded after l2
        else if (l2 > l1)
            return -1;
        else
            // equals case => lexographically by default returned by compareTo()
            return a.compareTo(b);
    }
}