import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name=scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beersNum = Integer.parseInt(scanner.nextLine());
        int chipsNum = Integer.parseInt(scanner.nextLine());

        double sumBeer = beersNum*1.20;
        double priceChips = (sumBeer*0.45);
        double sumChips =Math.ceil(chipsNum*priceChips);
        double resto = Math.abs(budget-(sumChips+sumBeer));

        if (budget>=sumBeer+sumChips){
            System.out.printf("%s bought a snack and has %.2f leva left.",name,resto);
        }else{
            System.out.printf("%s needs %.2f more leva!",name,resto);

        }

    }
}
