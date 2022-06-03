import java.util.*;

public class rest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        boolean[] rest = new boolean[42];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 42; j++)
            if ((arr[i] % 42) == j) {
                rest[j] = true;
            }
        }
        for (int i = 0; i < rest.length; i++) {
            if (rest[i] == true) {
                a++;
            }
        }
        System.out.println(a);
    }
}
