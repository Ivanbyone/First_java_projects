package tasks;

import java.util.Scanner;

/* Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере. Пробелы, знаки препинания, заглавные и строчные буквы важны!
Вводится целое число, по модулю не превосходящее 10000. */

public class NextAndPrevious {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a + 1) +".");
        System.out.print("The previous number for the number " + a + " is " + (a - 1) + ".");
    }
}
