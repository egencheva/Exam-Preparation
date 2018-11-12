import java.util.Scanner;

public class StadiumIncome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSector = Integer.parseInt(scanner.next());
        int capacity = Integer.parseInt(scanner.next());
        double priceTicket = Double.parseDouble(scanner.next());

        double allIncome = priceTicket*capacity;
        double sectorIncome= allIncome/countSector;
        double charity = (allIncome-sectorIncome*0.75)/8;

        System.out.printf("Total income - %.2f BGN%n",allIncome);
        System.out.printf("Money for charity - %.2f BGN",charity);
    }
}
