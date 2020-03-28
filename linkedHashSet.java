import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        // only 1 constructor
        LinkedHashSet l = new LinkedHashSet();
        l.add('B');
        l.add('C');
        l.add('D');
        l.add(1);
        l.add(null);
        l.add(25);
        // insertion order is preserved
        System.out.println("Insertion order is B C D 1 null 25");
        System.out.println(l);
    }
}