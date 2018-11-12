import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int match = Integer.parseInt(scanner.nextLine());
        int goalsAchieved = 0;
        int goalsRecieved = 0;
        int points = 0;
        int sumAchieved = 0;
        int sumRecieved = 0;
        int diff = 0;
        int count = 0;

        while (count < match) {

            goalsAchieved = Integer.parseInt(scanner.nextLine());
            goalsRecieved = Integer.parseInt(scanner.nextLine());

            sumAchieved += goalsAchieved;
            sumRecieved += goalsRecieved;
            diff += goalsAchieved - goalsRecieved;

            if (goalsAchieved - goalsRecieved > 0) {
                points += 3;
            } else if (goalsAchieved == goalsRecieved) {
                points += 1;
            }
            count++;
        }
        if (sumAchieved >= sumRecieved) {
            System.out.printf("%s has finished the group phase with %d points.%n", team, points);
            System.out.printf("Goal difference: %d.", diff);
        } else {
            System.out.printf("%s has been eliminated from the group phase.%n", team);
            System.out.printf("Goal difference: %d.", diff);
        }
    }
}


