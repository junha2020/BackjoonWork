import java.util.Scanner;
public class plus7{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i, j;
        i = sc.nextInt();

        for (j = 0; j < i; j++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print("Case #");
            System.out.print(j + 1);
            System.out.println(": " + a + " + " + b + " = " + a+b);
            }
        sc.close();
    }
}