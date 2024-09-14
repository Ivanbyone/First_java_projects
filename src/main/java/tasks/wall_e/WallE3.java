package tasks.wall_e;

import java.util.Scanner;

/* Робот ВАЛЛ-И решил отправиться в соседний город. Половину пути он проехал за t часов со скоростью x км/ч,
а остальное расстояние со скоростью y км/ч. Рассчитайте, сколько времени ВАЛЛ-И был в пути. */

public class WallE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(t + (t * x) / y);
    }
}
