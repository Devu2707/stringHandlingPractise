import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine().trim();
        int sum =0;
        for (int i = 0; i <sname.length() ; i++) {
            sum= (int)sname.charAt(i) + sum ;
        }
        System.out.println(sum);

    }
}
