import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        int n,k,s;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        s = scanner.nextInt();

        int heNeed = k*s;
        int iHave = 0;
        int i = 0;

        List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < n; j++){
            list.add(scanner.nextInt());
        }
        list.sort(Collections.reverseOrder());
        while (iHave < heNeed) {
            iHave+= list.get(i);
            i++;
        }
        System.out.println(i);
    }
}
