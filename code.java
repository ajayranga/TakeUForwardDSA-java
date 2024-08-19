import java.util.Scanner;

/**
 * code
 */
public class code {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();
            System.out.println("Hello there input is " + num);
        }
    }
}