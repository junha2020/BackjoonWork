import java.util.*;

public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cm = sc.nextInt();
        int tm = m + cm;
        if (tm % 60 == 0) {
            m = 0;
            h = (h + tm / 60);
        }
        else if (tm % 60 != 0) {
            m = tm % 60;
            h = (h + tm / 60);
        }
        if (h >= 24) {
            h =- 24;
        }
        System.out.print(h + " " + m);
        sc.close();
    }
}