package tasks;

import java.util.Scanner;

// Дано трехзначное число. Найдите сумму его цифр.

public class SumDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a / 100 + a / 10 % 10 + a % 10);
        sc.close();
    }
}
