import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for(int i = 0; i < count; i++) {
            System.out.println(reverse(sum(scanner.nextInt(), scanner.nextInt())));
        }
    }

    public static Integer sum(int first, int second) {
        return reverse(first) + reverse(second);
    }

    public static Integer reverse(Integer value) {
        char[] before = value.toString().toCharArray();
        char[] after = new char[value.toString().toCharArray().length];
        for(int i = 0; i < before.length; i++) {
            after[i] = before[before.length - i - 1];
        }
        return Integer.parseInt(new String(after));
    }
}
