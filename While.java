package starsprinting;
import java.util.*;

public class While {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i = 1;
        int next = 0;

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (i <= n) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
            i++;
        }

        s.close();
    }
}
