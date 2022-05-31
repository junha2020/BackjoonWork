import java.io.*;

public class cycle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a;
        int c = 1;

        while (true) {
            b = ((a%10)*10)+ (((a/10)+(a%10))%10);
            c++;
            if (b == a) {
                break;
            }
        }
        System.out.println(c);
    }
}
