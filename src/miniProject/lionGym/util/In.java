package miniProject.lionGym.util;

import java.util.Scanner;
/**
 * 입력 Util
 * @author dahee
 * @since 25.08.30
 */
public class In {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }
}
