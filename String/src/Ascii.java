import java.io.*;

public class Ascii {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            char s = br.readLine().charAt(0);
            System.out.println((int)s);
        } catch (Exception e) {
            return;
        }
    }
}
