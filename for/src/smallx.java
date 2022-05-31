import java.util.Scanner;

public class smallx {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N, X, k;
        N = sc.nextInt();;
        X = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            k = sc.nextInt();
            arr[i] = k;
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
