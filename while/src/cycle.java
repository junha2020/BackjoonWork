import java.util.*;

public class cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fnum = sc.nextInt();
        int num = fnum;
        int nnum, tnum, onum, to;
        int c = 0;

        do {
            tnum = num / 10;
            onum = num % 10;
            to = tnum + onum;
            if (to >= 10) {
                to = to - 10;
            }
            nnum = onum * 10 + to;
            num = nnum;
            c++;
        } while (fnum != nnum);
        System.out.println(c);
    }
}
