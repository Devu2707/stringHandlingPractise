import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sname=sc.nextLine().trim();
        System.out.print("Index : ");
        for (int i = 0; i <(sname.length()) ; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n"+"Chars : ");
        for (int j = 0; j <sname.length() ; j++) {

                System.out.print(sname.charAt(j) + "\t");
        }
         sc.close();

    }
}
