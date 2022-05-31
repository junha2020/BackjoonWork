import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int a = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            int j = sc.nextInt();
            arr[i] = j;
            if (max <= arr[i]) {
                max = arr[i];
                a = i;
            }
        }
        System.out.println(max);
        System.out.println(a+1);
    }
}
