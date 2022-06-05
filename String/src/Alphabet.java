import java.util.*;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] Alpha = new int[26];
        for (int i = 0; i < Alpha.length; i++) {
            Alpha[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = c - (int)'a';
            if (Alpha[n] == -1) {
                Alpha[n] = i;
            }
        }
        for (int i = 0; i < Alpha.length; i++) {
            System.out.print(Alpha[i] + " ");
        }
    }
}
