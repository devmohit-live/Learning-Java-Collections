import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.StreamHandler;

public class check {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d, m, n, p, q;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        String s[] = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        p = Integer.parseInt(s[2]);
        q = Integer.parseInt(s[3]);
        // m=Integer.parseInt(br.readLine());
        System.out.println("a,b,c,d " + a + " " + b + " " + c + " " + d);
        System.out.println("m,n,p,q " + m + " " + n + " " + p + " " + q);
    }
}