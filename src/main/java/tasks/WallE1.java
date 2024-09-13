package tasks;

import java.util.Scanner;

/* Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число,
которое задумали его головы. Первая голова называет любое целое число, вторая - увеличивает его на 3,
а третья результат уменьшает в 2 раза.
Составьте программу, которая позволит ВАЛЛ-И безошибочно вычислять результат.*/

public class WallE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num + 3) / 2.0);
    }
}
