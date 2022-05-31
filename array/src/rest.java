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
        for (int i = 0; i < 10; i++) {
            try {
                for (int j = 0; j < 10; j++) {
                    if (arr[i] % 42 != arr[j] % 42) {
                        a++;
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        System.out.println(a);
    }
}
