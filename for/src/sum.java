import java.util.Scanner;
public class sum{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i, k;
        i = sc.nextInt();
        k = 0;

        for (int j = 1; j <= i; j++) {
            k += j;
        }

        System.out.println(k);

        sc.close();
    }
}