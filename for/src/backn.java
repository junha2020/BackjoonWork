import java.util.Scanner;

public class backn {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = i; i > 0; i--) {
            System.out.println(i);
        }
    }
}