import java.util.*;

class Lambda {
    public static void main(String[] args) {
        int ar[] = { 12, 15, 16, 0, 1861, 161, 121, -59, 15, -9426 };
        Integer[] arr = new Integer[ar.length];
        System.out.println("Before Sorting");
        for (int i = 0; i < ar.length; i++) {
            arr[i] = ar[i];
            System.out.println(ar[i] + " ");
        }
        System.out.println("After Sorting using lambda");
        /**
         * Arrays sort with comparator works only on User defined datatypes and Wrapper
         * classes not on primitive datatypes like int
         */
        Arrays.sort(arr, (a, b) -> {
            return Math.abs(a) - Math.abs(b);
        });
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}