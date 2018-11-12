import java.util.Scanner;

public class GoingHome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        int lPerkm = Integer.parseInt(scanner.nextLine());
        double pricePerL = Double.parseDouble(scanner.nextLine());
        double income = Double.parseDouble(scanner.nextLine());
        double incomePerP = income / 5;

        double priceFuel = (km / 100) * lPerkm * pricePerL;

        if (income - priceFuel >= 0) {
            System.out.printf("You can go home. %.2f money left.", income - priceFuel);
                } else {
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", incomePerP);
        }
    }
}

