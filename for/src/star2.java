import java.util.Scanner;

public class star2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= i-j; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < j; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
