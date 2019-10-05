import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname = sc.nextLine().trim();
        System.out.println("Enter string to be replaced : ");
        String str = sc.nextLine().trim();
        System.out.println("Enter string replacement : ");
        String s = sc.nextLine().trim();
        System.out.println(sname.replaceAll(str,s));
    }
}
