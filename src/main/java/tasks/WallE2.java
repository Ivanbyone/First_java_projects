package tasks;

import java.util.Scanner;

public class WallE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print(a % 10 + b % 10 + c % 10 + "vll");
    }
}
