import java.util.Scanner;

public class InputHelper {
    private Scanner scnr = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.print(prompt);
        return scnr.nextLine();
    }

    public int getValidatedInt(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scnr.hasNextInt()) {
                value = scnr.nextInt();
                scnr.nextLine();
                 if (value >= min && value <= max) {
                    return value;
                }
            } else {
                scnr.nextLine();
            }
            System.out.println("Invalid input. Enter a number between " + min + " and " + max + ".");
        }
    }

    public boolean getBoolean(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scnr.hasNextBoolean()) {
                boolean val = scnr.nextBoolean();
                scnr.nextLine();
                return val;
            } else {
                scnr.nextLine();
                System.out.println("Invalid input. Enter true or false.");
            }
        }
    }

    public void close() {
        scnr.close();
    }
}
