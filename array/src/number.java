import java.util.*;

public class number {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int d = a * b * c;
        int[] arr = new int[10];
        while (d > 0) {
            arr[d % 10]++;
            d /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
