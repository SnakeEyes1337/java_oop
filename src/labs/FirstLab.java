package labs;

import java.util.Scanner;

public class FirstLab {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        final int consoleValue = scanner.nextInt();
        printAllNumbers(consoleValue-6);
    }

    private void printAllNumbers(int number) {
        for (int i = number; i > number - 10 * 6; i -= 6) {
            System.out.println(i);
        }
    }
}
