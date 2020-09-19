import java.util.Arrays;
import java.util.Scanner;

public class mod_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] weights = new int[17];
        for (int i = 16; i >= 0; i--) {
            weights[i] = (int)(Math.pow(2, 17 - i) % 11);
        }
        char[] check = {'1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2'};
        int code = 0;
        for (int i = 0; i < str.length(); ++i) {
            int n=str.charAt(i) - 48;
            code = code + n * weights[i];
        }
        code = code % 11;
        System.out.println(check[code]);
    }
}
