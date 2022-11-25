package HomeWork;

import java.util.Scanner;

public class HomeWork23nov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int i = number;
        while (i <= number) {
            if (i > 0 && i != number) {
                if (number % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
            i--;
        }
        //or --------------
        for (int j = number; j <= number; j--) {  //тут наверно неправильно, пишет что for или 0 или ∞,
            if (j > 0 && j != number) {           //хотя считает правильно, не знаю как исправить, не дошло до меня:(
                if (number % j == 0) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}




