package encryptdecrypt;
import java.util.*;
public class Main {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int no = sc.nextInt();
        char[] ch1 = str2.toCharArray();

        if (str1.equals("enc")) {
            for (char ch : ch1) {
                System.out.print((char) ((int) ch + no));
            }
        }
        if (str1.equals("dec")) {
            for (char ch : ch1) {
                System.out.print((char) ((int) ch - no));
            }
        }
    }
}
