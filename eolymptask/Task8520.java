import java.util.Scanner;

class Task8520 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;


        if (x < 5) {
            y = x * x - 3 * x + 4;
        } else {
            y = x + 7;
        }

        System.out.println(y);
    }


}


