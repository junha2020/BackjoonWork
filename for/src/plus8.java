import java.util.Scanner;
public class plus8{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i, j;
        i = sc.nextInt();
        int a, b;
        for (j = 0; j < i; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print("Case #");
            System.out.print(j + 1);
            System.out.print(": " + a + " + " + b + " = ");
            System.out.println(a + b);
        }
        sc.close();
    }
}