package tasks;

import java.util.Scanner;

/* Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
Программа получает на вход три числа: a, b, n.
Программа должна вывести два числа: стоимость покупки в рублях и копейках. */

public class Coast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print((a * 100 + b) * c / 100 + " " + (a * 100 + b) * c % 100);
        sc.close();
    }
}
