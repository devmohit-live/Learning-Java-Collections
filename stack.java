import java.util.Stack;

class stack {
    public static void main(String[] args) {
        // child of vector hence it is also a legacy class
        Stack<Character> s = new Stack<>(); // only 1 costructor
        // since child of vector all vector methods are supported
        // methods
        // empty is used instead of isEmpty()
        System.out.println("Stack is Empty ? " + s.empty());
        s.add('A');
        s.add('B');
        s.addElement('C');
        // extra method of stack(it's own):
        System.out.println("Index of A " + s.search('A'));
        System.out.println("Index of Z " + s.search('Z'));
        s.push('M');
        s.push('P');
        System.out.println("Popping item " + s.pop());

        System.out.println("Remember we are traversing not popping so in traversing LIFO isn't maintained " + s);

    }
}