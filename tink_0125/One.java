package tink_0125;
import java.util.Scanner;
public class One {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.indexOf('M') == 2 || (str.indexOf('M') == 1 && str.indexOf('R') == 0)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}