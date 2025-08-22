package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int org_a = 0;
        int org_n = n;
        int a = 0;
        boolean tf = false;
        int cnt = 1;

        while (true) {
            if (n == 0) {
                break;
            } else {
                cnt++;
                n = n / 10;
            }
        }
        cnt --;
        a = org_n - cnt * 9;
        while (a <= org_n) {

            a++;
            org_a = a;
            int sum = a;

            int chk_a = a;
            while (chk_a > 0) {
                int b = chk_a % 10;
                sum += b;
                chk_a = chk_a / 10;
            }

            if (sum == org_n) {
                tf = true;
                break;
            }
        }

        if (tf) {
            System.out.println(org_a);
        } else {
            System.out.println(0);
        }
    }
}
