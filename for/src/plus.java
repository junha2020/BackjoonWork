import java.util.Scanner;
public class plus{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i, j;
        i = sc.nextInt();
        int arr[] = new int[i];

        for (j = 0; j < i; j++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            arr[j] = a + b;
        }

        for (int k = 0; k < i; k++) {
            System.out.println(arr[k]);
        }

        sc.close();
    }
}