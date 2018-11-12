import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTicketGo = Double.parseDouble(scanner.nextLine());
        double priceTicketBack = Double.parseDouble(scanner.nextLine());
        double priceGame = Double.parseDouble(scanner.nextLine());
        double nGame = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double sumTickets = (priceTicketGo + priceTicketBack) * ((100-discount)/100);
        double sumGame = nGame * priceGame;
        double pricePerOne = sumGame + sumTickets;
        double ttlSum = pricePerOne*6;
        System.out.printf("Total sum: %.2f lv.%n",ttlSum);
        System.out.printf("Each friend has to pay %.2f lv.",pricePerOne);
    }
}