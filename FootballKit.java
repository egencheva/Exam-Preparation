import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTShirt = Double.parseDouble(scanner.nextLine());
        double amountBall = Double.parseDouble(scanner.nextLine());

        double priceShorts = priceTShirt * 0.75;
        double priceSox = priceShorts * 0.2;
        double priceShoes = (priceShorts + priceTShirt) * 2;

        double sum = (priceTShirt + priceShorts + priceSox + priceShoes)-(priceTShirt + priceShorts + priceSox + priceShoes) * 0.15;

        if (amountBall <= sum) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sum);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", amountBall - sum);
        }

    }
}
