package HomeWork;

import java.util.Scanner;

public class HomeWorkLevelTwo23nov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма вклада: ");
        double moneyInBank = scanner.nextDouble();
        System.out.println("Процент: ");
        double percent = scanner.nextDouble();
        System.out.println("Количество лет: ");
        int year = scanner.nextInt();
        for (int i = 0; i < year; i++) {
            double capitalizationPerYear = (moneyInBank / 100 * percent);
            moneyInBank += capitalizationPerYear;
            int moneyAfterCapitalization = (int) moneyInBank;
            String f;
            if (i == 0) {
                f = " год ";
            } else if ( i <= 3) {
                f = " года ";
            } else {
                f = " лет ";
            }
            System.out.println("Сумма после капитализации через " + (i + 1) + f + moneyAfterCapitalization);
        }
    }
}
