import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();
        if (r1 == r2) {
            if (r2 == r3) {
                System.out.println(10000 + r1 * 1000);
            }
            else {
                System.out.println(1000 + r1 * 100);
            }
        }
        else if (r1 == r3) {
            System.out.println(1000 + r1 * 100);
        }
        else if (r2 == r3) {
            System.out.println(1000 + r2 * 100);
        }
        else {
            if (r1 > r2) {
                if (r1 > r3) {
                    System.out.println(r1 * 100);
                }
                else {
                    System.out.println(r3 * 100);
                }
            }
            else if (r1 > r3) {
                System.out.println(r2 * 100);
            }
            else {
                if (r2 > r3) {
                    System.out.println(r2 * 100);
                }
                else {
                    System.out.println(r3 * 100);
                }
            }
        }
        sc.close();
    }
}
