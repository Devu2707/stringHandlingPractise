import java.util.Scanner;

import static java.lang.System.*;

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String sname = sc.nextLine().trim();
        int sum = 0;
        for (int i = 0; i < sname.length(); i++) {
            if ((int) sname.charAt(i) >= 65 && (int) sname.charAt(i) <= 91) {
                sum = sum + (int) sname.charAt(i);
            }
        }
        sc.close();
        out.println(sum);
    }
}