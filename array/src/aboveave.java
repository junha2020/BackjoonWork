import java.util.*;

public class aboveave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sn = sc.nextInt();
            double[] ss = new double[sn];
            double sum = 0, ave = 0, aas = 0;
            for (int j = 0; j < ss.length; j++) {
                double sco = sc.nextDouble();
                ss[j] = sco;
                sum =+ sco;
            }
            ave = sum / sn;
            for (int k = 0; k < ss.length; k++) {
                if (ss[k] > ave) {
                    aas++;
                }
            }
            double poaa = aas / sn;
            System.out.println(String.format("%.3f", poaa*100) + "%");
        }
    }
}
