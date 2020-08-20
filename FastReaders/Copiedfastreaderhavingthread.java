// package Other_Related;

import java.io.*;
import java.util.*;
import java.math.*;

class FastReader {
    final int mod = (int) 1e9 + 7;
    final double eps = 1e-6;
    final double pi = Math.PI;
    final long inf = Long.MAX_VALUE / 2;
    InputStream obj; // fast input
    PrintWriter out; // fast output
    String check = "";

    void main1() throws IOException {
        out = new PrintWriter(System.out);
        obj = check.isEmpty() ? System.in : new ByteArrayInputStream(check.getBytes());
        // obj=check.isEmpty() ? new FileInputStream("/home/input.txt") : //for file
        // new ByteArrayInputStream(check.getBytes());
        // solve(); // the solving method
        out.flush();
        out.close();
    }

    byte inbuffer[] = new byte[1024];
    int lenbuffer = 0, ptrbuffer = 0;

    int readByte() {
        if (lenbuffer == -1)
            throw new InputMismatchException();
        if (ptrbuffer >= lenbuffer) {
            ptrbuffer = 0;
            try {
                lenbuffer = obj.read(inbuffer);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
        }
        if (lenbuffer <= 0)
            return -1;
        return inbuffer[ptrbuffer++];
    }

    String rs() { // read String
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) // when nextLine, (isSpaceChar(b) && b!=' ')
        {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    int ri() { // read int
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    long rl() { // read long
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    boolean isSpaceChar(int c) {
        return (!(c >= 33 && c <= 126));
    }

    int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b))
            ;
        return b;
    }

    float rf() { // read float
        return Float.parseFloat(rs());
    }

    double rd() { // read double
        return Double.parseDouble(rs());
    }

    char rc() { // read charachter
        return (char) skip();
    }

    int[] ria(int n) {
        // read integerarray
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ri();
        return a;
    }

    long[] rla(int n) { // read long array
        long a[] = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = rl();
        return a;
    }

    String[] rsa(int n) {
        // read string array
        String a[] = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = rs();
        return a;
    }

    double[][] rdm(int n, int m) {
        // read double type matrix
        double a[][] = new double[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = rd();
        return a;
    }

    int[][] rim(int n, int m) {
        // read int type matrix
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = ri();
        return a;
    }
}

public class Copiedfastreaderhavingthread {
    // // ------------> Solution starts here!!
    // @SuppressWarnings("Main Logic") //to supress the warnings caused due to this
    // void solve() {
    // for (int t = ri(); t > 0; t--) {
    // int a[][] = iim(3, 3);
    // long ans = 0;
    // for (int i = 0; i < 3; i++) {
    // long temp = 0, temp1 = 0;
    // for (int j = 0; j < 3; j++) {
    // temp += a[i][j];
    // temp1 += a[j][i];
    // }
    // ans = Math.max(ans, temp);
    // ans = Math.max(ans, temp1);
    // }
    // out.println(ans == 0 ? ans : ans % 2 == 0 ? ans - 1 : ans);
    // }
    // }
    // ------------> Solution ends here!!
    public static void main(String[] args) throws IOException {

        new Thread(null, new Runnable() {
            public void run()// code to be runned by thread
            {
                try {
                    FastReader f = new FastReader();
                    f.main1();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (StackOverflowError e) {
                    System.out.println("RTE");
                }
            }
        }, "1", 1 << 26).start();
        // FastReader f = new FastReader();
        int t = f.ri();
        int n, k;
        f.out.println("T is " + t);
        while (t-- > 0) {
            n = f.ri();
            k = f.ri();
            f.out.println("N and K are " + n + k);
            int a[] = new int[n];
            a = f.ria(n);
            f.out.println("Array is " + a);
        }

    }
}