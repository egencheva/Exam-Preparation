import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numPc = Double.parseDouble(scanner.nextLine());
        double count = 0;
        double ttlSls = 0.0;
        double sales = 0.0;
        double rate = 0.0;
        double ttlRate = 0.0;
        double avgRate = 0.0;
        double PC = 0.0;

        while (count < numPc) {
            PC = Double.parseDouble(scanner.nextLine());
            rate = PC % 10;
            sales = Math.floor(PC / 10);
            if (rate == 2) {
                sales = 0;

            } else if (rate == 3) {
                sales = sales * 0.50;

            } else if (rate == 4) {
                sales = sales * 0.70;

            } else if (rate == 5) {
                sales = sales * 0.85;
            } else if (rate == 6) {
                sales = sales;
            }
            ttlSls += sales;
            ttlRate += rate;
            count++;
        }

        avgRate = ttlRate / (count);
        System.out.printf("%.2f%n", ttlSls);
        System.out.printf("%.2f", avgRate);
    }
}

