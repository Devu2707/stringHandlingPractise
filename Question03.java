import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine().trim();
        sname = sname.toLowerCase();
        char[] t = sname.toCharArray();
        for (int i = 0; i <sname.length() ; i++) {
            if (t[i]=='a' || t[i]=='e' || t[i]=='i' || t[i]=='o' || t[i]=='u'){
                t[i]='*';
            }
        }
        System.out.println(t);
    }
}
