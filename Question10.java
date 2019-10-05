import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine().trim();
        char ch = sc.next().charAt(0);
        for (int i = 0; i <sname.length() ; i++) {
            if (sname.charAt(i)==ch){
                System.out.println(i);
                break;
            }
        }
    }
}
