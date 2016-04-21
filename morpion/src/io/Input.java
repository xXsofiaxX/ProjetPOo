package io;

import java.util.Scanner;

public class Input {
    public Input() {
    }

    public static int readInt(Scanner scan) {
        String input = scan.nextLine();
        boolean result = true;

        try {
            int result1 = Integer.parseInt(input);
            return result1;
        } catch (NumberFormatException var4) {
            return -1;
        }
    }
}
