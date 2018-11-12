import java.util.Scanner;

public class OwnBusiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        int volume = width * length * hight;
        String input = scanner.nextLine();
        int number = 0;
        int sumNumber = 0;

        while (!input.equals("Done")) {
            number = Integer.parseInt(input);
            sumNumber += number;
            if (sumNumber > volume) {
                System.out.printf("No more free space! You need %d Cubic meters more.", sumNumber - volume);
                break;
            } else {
                input = scanner.nextLine();
            }
        }
        if (input.equals("Done") || sumNumber <= volume) {
            System.out.printf("%d Cubic meters left.", volume - sumNumber);
        }
    }
}

