import java.util.*;

public class oxquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            String s1 = sc.next();
            s[i] = s1;
        }
        sc.close();
        for (int i = 0; i < s.length; i++) {
            int loop = 0;
            int sco = 0;
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == 'O') {
                    loop++;
                }
                else {
                    loop = 0;
                }
                sco =+ loop;
            }
            System.out.println(sco);
            }
    }
}
