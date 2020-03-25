class MyPair<X, Y> {
    X x;
    Y y;

    MyPair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    void getDescription() {
        System.out.println("Key is " + x + " Value is " + y);
    }
}

public class BasicGeneric {
    public static void main(String[] args) {
        MyPair<Integer, String> si = new MyPair(1, "One");
        si.getDescription();
        MyPair<Integer, Integer> ii = new MyPair(2, 11);
        ii.getDescription();
        MyPair<Integer, Boolean> ib = new MyPair(0, false);
        ib.getDescription();
    }
}