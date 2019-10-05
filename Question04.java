import org.ietf.jgss.GSSName;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine().trim();
        sname=sname.toLowerCase();
        char[] t=sname.toCharArray();
        int c=1;
        for (int i = 0; i <sname.length() ; i++) {
            if ((t[i]=='a' || t[i]=='e' || t[i]=='i' || t[i]=='o' || t[i]=='u')){
                if (c==1){
                    t[i]='*';
                    c=c+1;
                }
                else if (c==2){
                    t[i]='^';
                    c=c+1;
                }
                else if (c==3){
                    t[i]='!';
                    c=1;
                }
            }
        }
        System.out.println(t);
    }

}
