import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        double numSouvenirs = Integer.parseInt(scanner.nextLine());
        double priceSouvenir = 0;
        boolean validSouvenir = true;
        boolean validTeam = true;

        switch (team) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        priceSouvenir = 3.25;
                        break;
                    case "caps":
                        priceSouvenir = 7.20;
                        break;
                    case "posters":
                        priceSouvenir = 5.10;
                        break;
                    case "stickers":
                        priceSouvenir = 1.25;
                        break;
                    default:
                        validSouvenir = false;
                }
                break;

            case "Brazil":
                switch (souvenir) {
                    case "flags":
                        priceSouvenir = 4.20;
                        break;
                    case "caps":
                        priceSouvenir = 8.50;
                        break;
                    case "posters":
                        priceSouvenir = 5.35;
                        break;
                    case "stickers":
                        priceSouvenir = 1.20;
                        break;
                    default:
                        validSouvenir = false;
                }
                break;
            case "Croatia":
                switch (souvenir) {
                    case "flags":
                        priceSouvenir = 2.75;
                        break;
                    case "caps":
                        priceSouvenir = 6.90;
                        break;
                    case "posters":
                        priceSouvenir = 4.95;
                        break;
                    case "stickers":
                        priceSouvenir = 1.10;
                        break;
                    default:
                        validSouvenir = false;
                }
                break;
            case "Denmark":
                switch (souvenir) {
                    case "flags":
                        priceSouvenir = 3.10;
                        break;
                    case "caps":
                        priceSouvenir = 6.50;
                        break;
                    case "posters":
                        priceSouvenir = 4.80;
                        break;
                    case "stickers":
                        priceSouvenir = 0.90;
                        break;
                    default:
                        validSouvenir = false;
                }
                break;
            default:
                validTeam = false;
        }
        if (validTeam && validSouvenir) {
            double allsum = numSouvenirs * priceSouvenir;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", numSouvenirs,souvenir, team, allsum);
        } else if (!validTeam) {
            System.out.print("Invalid country!");
        } else {
            System.out.print("Invalid stock!");
        }
    }

}