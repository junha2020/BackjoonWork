import java.util.Scanner;

public class star1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 0; j < i; j++) {
            for (int k = 0; k < j+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
