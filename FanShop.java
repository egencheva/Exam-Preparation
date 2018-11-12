import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int price = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String item = scanner.nextLine();
            switch (item) {
                case "hoodie":
                    price = 30;
                    break;
                case "keychain":
                    price = 4;
                    break;
                case "T-shirt":
                    price = 20;
                    break;
                case "flag":
                    price = 15;
                    break;
                case "sticker":
                    price = 1;
                    break;
            }
            sum += price;
        }
        int diff = Math.abs(budget - sum);
        if (budget >= sum) {
            System.out.printf("You bought %d items and left with %d lv.", n, diff);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", diff);
        }
    }
}