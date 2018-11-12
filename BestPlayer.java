import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int goals = 0;
        int maxGoal = 0;
        String bestPlayer = "";

        while (!name.equals("END")) {
            name = scanner.nextLine();
            if (name.equals("END")) {
                break;
            }
            goals = Integer.parseInt(scanner.nextLine());
            if (maxGoal < goals) {
                maxGoal = goals;
                bestPlayer = name;
                if (maxGoal >= 10) {
                    break;
                }
            }
        }
        if (maxGoal >= 10) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %s goals and made a hat-trick !!!", maxGoal);
        } else if (maxGoal >= 3) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %s goals and made a hat-trick !!!", maxGoal);
        } else if (maxGoal < 3) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals.%n", maxGoal);
        }
    }
}