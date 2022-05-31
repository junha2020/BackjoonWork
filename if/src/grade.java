import java.util.Scanner;
public class grade {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int test;
        test = sc.nextInt();

        if (test > 89) {
            System.out.println("A");
        }
        else if (test > 79) {
            System.out.println("B");
        }
        else if (test > 69) {
            System.out.println("C");
        }
        else if (test > 59) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}