import java.util.Scanner;

public class Hangover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            float c = scanner.nextFloat();
            int delitel = 2;
            float output = 0.00f;
            if(c != 0.00f) {
                while(c > output) {
                    output = output + (float)1 / delitel;
                    delitel++;
                }
                delitel = delitel - 2;
                System.out.println(delitel + " card(s)");
            }
        }
    }
}
