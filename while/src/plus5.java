import java.util.*;

public class plus5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 & b == 0) {
                break;
            }
            else {
                System.out.println(a + b);
            }
        }
    }
}