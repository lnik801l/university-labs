package tech.spaceworld.l_nik801_l.labs.lab5;

import java.util.Scanner;

public class main {
    public main() {
        Scanner in = new Scanner(System.in);
        int val;

        System.out.println("Привет! я лаба 5");
        System.out.println("Для всех вариантов:\n" +
                "   \n" +
                "   - Ввести произвольную размерность квадратной матрицы в интервале 1..10.\n" +
                "   \n" +
                "   - Предложить ввод данных (чисел целого типа) двумя способами:\n" +
                "   \n" +
                "   1. Через датчик случайных чисел на интервале -100..100.\n" +
                "   \n" +
                "   2. С клавиатуры в виде «Х[i],[j]=», где i и j – числа, соответствующие номеру строки и столбца.\n" +
                "   \n" +
                "   - После окончания ввода данных вывести на экран матрицу в отформатированном виде по строкам и столбцам.");
        System.out.println(
                "Вариант 10.\n" +
                "   Найти среднее арифметическое элементов каждого из нечетных столбцов этой матрицы."
        );
        System.out.println("Введите размерность матрицы:");
        while (true) {
            val = Integer.parseInt(in.nextLine());
            if (val > 0)
                break;
            if (val <= 0)
                System.out.println("Неверное значение. Повторите попытку");
        }
        int[][] matrix = new int[val][val];
        System.out.println("Заполнить матрицу автоматически (0) или вручную (1)?");
        int input = Integer.parseInt(in.nextLine());
        if (input == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random()*(200+1)) - 100;
                }
            }
            System.out.println("Вывод заполненной матрицы: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
        if (input == 1) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }
}
