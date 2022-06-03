import java.util.*;

public class ave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] sco = new double[n];
        for (int i = 0; i < sco.length; i++) {
            int sub = sc.nextInt();
            sco[i] = sub;
        }
        double bsco = sco[0];
        for (int i = 0; i < sco.length; i++) {
            if (bsco < sco[i]) {
                bsco = sco[i];
            }
        }
        for (int i = 0; i < sco.length; i++) {
            sco[i] = sco[i] / bsco * 100;
        }
        double sum = 0;
        for (int i = 0; i < sco.length; i++) {
            sum =+ sco[i];
        }
        double ave = sum / n;
        System.out.println(ave);
    }
}
