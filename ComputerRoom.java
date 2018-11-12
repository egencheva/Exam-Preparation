import java.util.Scanner;

public class ComputerRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int numPeople = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        double price = 0.0;
        boolean validMonth = true;
        double percentDiscount = 0;

        switch (month) {
            case ("march"):
                switch (dayTime) {
                    case "day":
                        price = 10.50;
                        break;
                    case "night":
                        price = 8.40;
                        break;
                }
                break;
            case ("april"):
                switch (dayTime) {
                    case "day":
                        price = 10.50;
                        break;
                    case "night":
                        price = 8.40;
                        break;
                }
                break;

            case ("may"):
                switch (dayTime) {
                    case "day":
                        price = 10.50;
                        break;
                    case "night":
                        price = 8.40;
                        break;
                }
                break;
            case ("june"):
                switch (dayTime) {
                    case "day":
                        price = 12.60;
                        break;
                    case "night":
                        price = 10.20;
                        break;
                }
                break;
            case ("july"):
                switch (dayTime) {
                    case "day":
                        price = 12.60;
                        break;
                    case "night":
                        price = 10.20;
                        break;
                }
                break;
            case ("august"):
                switch (dayTime) {
                    case "day":
                        price = 12.60;
                        break;
                    case "night":
                        price = 10.20;
                        break;
                }
            default:
                validMonth = false;
                break;
        }
            if (numPeople >= 4 && hours >=5) {
            percentDiscount = 0.45;

        } else if (numPeople >= 4 && hours < 5) {
            percentDiscount = 0.9;

        } else if (numPeople >= 4 && hours < 5) {
                percentDiscount = 0.5;

            }else{
            percentDiscount = 1.0;
        }
        double ttlPrice = price * hours * numPeople * percentDiscount;
        double pricePerPerson = price * percentDiscount;
        System.out.printf("Price per person for one hour: %.2f%n",pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f",ttlPrice);

    }
}
