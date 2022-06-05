import java.util.*;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int rn = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                int a = 0;
                while (true) {
                    System.out.print(s.charAt(j));
                    a++;
                    if (a == rn) {
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
