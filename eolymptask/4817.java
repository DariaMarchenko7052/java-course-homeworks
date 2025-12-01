import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
