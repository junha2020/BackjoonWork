import java.util.*;

public class SumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char num = s.charAt(i);
            sum += Character.getNumericValue(num);
        }
        System.out.println(sum);
    }
}
