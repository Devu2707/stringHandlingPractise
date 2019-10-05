import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.math.*;
public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine().trim();
        int uppersum=0;
        int lowersum=0;
        for (int i = 0; i <sname.length() ; i++)
            if ((int) sname.charAt(i) >= 65 && (int) sname.charAt(i) <= 91) {
                uppersum = uppersum + (int) sname.charAt(i);
            } else if((int)sname.charAt(i)>=97 && (int)sname.charAt(i)<=123){
                lowersum = lowersum + (int) sname.charAt(i);
            }
        int absolutesum = uppersum - lowersum;
        System.out.println(Math.abs(absolutesum));
    }
}
