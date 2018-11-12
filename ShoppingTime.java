import java.util.Scanner;

public class ShoppingTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timeBreak = Double.parseDouble(scanner.nextLine());
        double pricePeriphery = Double.parseDouble(scanner.nextLine());
        double priceSoftware = Double.parseDouble(scanner.nextLine());
        double priceFrappe = Double.parseDouble(scanner.nextLine());
        double timeFrappe = 5;
        double timeShopping = 3 * 2 + 2 * 2;

        double timeRelax = timeBreak - timeFrappe - timeShopping;
        double ttlExpense = pricePeriphery * 3 + priceSoftware * 2 + priceFrappe;

        System.out.printf("%.2f%n", ttlExpense);
        System.out.printf("%.0f",timeRelax);

    }
}