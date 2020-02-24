import java.util.Scanner;

public class Ant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if(number > 0) {
                double sq = Math.sqrt(number); // 5,3  4,3
                int roundedSq = (int) Math.round(sq); // 5, 4

                if(roundedSq % 2 == 0) {
                    if(sq > roundedSq) {
                        System.out.println(roundedSq + 1 + " " + (number - (roundedSq*roundedSq)));
                    } else if( sq < roundedSq) {
                        System.out.println(roundedSq + " " + ((roundedSq*roundedSq) - number + 1));
                    } else if( sq == roundedSq) {
                        System.out.println(roundedSq + " " + 1);
                    }
                } else {
                    if(sq > roundedSq) {
                        System.out.println((number - (roundedSq*roundedSq)) + " " + (roundedSq + 1));
                    } else if( sq < roundedSq) {
                        System.out.println(((roundedSq*roundedSq) - number + 1) + " " + roundedSq);
                    } else if( sq == roundedSq) {
                        System.out.println(1 + " " + roundedSq);
                    }
                }
            }
        }
    }
}
