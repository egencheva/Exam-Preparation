import java.util.Scanner;

public class GameInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        int numMatches = Integer.parseInt(scanner.nextLine());
        double minPerMatch = 0.0;
        double ttlMin = 0.0;
        int countAddTime = 0;
        int countPenalty = 0;
        int count = 0;

        for (int i = 1; i <= numMatches; i++) {
            minPerMatch = Double.parseDouble(scanner.nextLine());
            ttlMin += minPerMatch;
            count++;
            if (minPerMatch > 90 && minPerMatch<=120) {
                countAddTime++;
            } else if (minPerMatch >120) {
                countPenalty++;
            }
        }
        double avgMin = ttlMin / numMatches;
        System.out.printf("%s has played %.0f minutes. Average minutes per game: %.2f%n",team,ttlMin,avgMin);
        System.out.printf("Games with penalties: %d%n",countPenalty);
        System.out.printf("Games with additional time: %d%n",countAddTime);
    }
}

