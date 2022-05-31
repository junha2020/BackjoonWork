import java.util.*;

public class bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[a-1]);
    }
}
