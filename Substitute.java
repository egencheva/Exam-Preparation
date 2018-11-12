import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int countChange = 0;
        int countSamePl=0;

        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >= N; l--) {
                        if (countChange-countSamePl == 6) {
                            return;
                        } else if (i % 2 == 0 && k % 2 == 0 && j % 2 != 0 && l % 2 != 0) {
                            countChange++;
                            if (i == k && j == l) {
                                countSamePl++;
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("" + i + j + " - " + k + l + "%n");
                            }
                        }

                    }
                }
            }
        }
    }
}

