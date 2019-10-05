import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sname = sc.nextLine();
        int index = sc.nextInt();

        System.out.print(sname.substring(index));
    }
}
