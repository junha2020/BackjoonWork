import java.util.Scanner;
public class gugu{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();

        for (int j = 1; j < 10; j++) {
            System.out.println(i + " * " + j + " = " + i*j);
        }
    }
}