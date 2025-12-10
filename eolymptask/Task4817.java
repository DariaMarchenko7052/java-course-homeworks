import java.util.Scanner;

public class Task4817 {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int p = 2 * (n + m);
            int s = n * m;

            System.out.println(p + " " + s);
        }

        sc.close();
    }
}
