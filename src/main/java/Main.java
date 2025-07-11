import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message;
        int score, bonus;

        String[] inputValues = readInput();
        message = inputValues[0];
        score = Integer.parseInt(inputValues[1]);
        bonus = Integer.parseInt(inputValues[2]);

        String result = message + ' ' + Integer.toString(score * bonus);

        System.out.println(result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}
