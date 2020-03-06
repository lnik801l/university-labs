package tech.spaceworld.l_nik801_l.labs.lab1;

import java.util.Scanner;

public class main {
    public main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Привет! я лаба 1!");
        System.out.println(
                "Вариант 10.\n" +
                "   Задание:" +
                "   Даны целые числа N и M. Определить на интервале <от меньшего из них до большего из них>,\n" +
                "   каких целых чисел больше - делящихся на 3, или делящихся на 4.\n" +
                "   Если ни одно из чисел не делится ни на 3, ни на 4, сообщить об этом."
        );
        System.out.println("Введите число N:");
        int n = Integer.parseInt(in.nextLine());
        System.out.println("Введите число M:");
        int m = Integer.parseInt(in.nextLine());

        System.out.println("Выполнение программы...");
        long timeStart = System.currentTimeMillis();

        int mod3 = 0;
        int mod4 = 0;
        for (int i = Math.min(n,m); i < Math.max(n,m); i++) {
            if (i % 3 == 0)
                mod3++;
            if (i % 4 == 0)
                mod4++;
        }
        if (mod3 == 0 && mod4 == 0) {
            System.out.println("Чисел, делящихся на 3 или 4 не существует.");
            System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - timeStart) + " мс.");
            return;
        }
        if (mod3 > mod4)
            System.out.println("Чисел, делящихся на 3, больше, чем чисел, делящихся на 4");
        else
            System.out.println("Чисел, делящихся на 4, больше, чем чисел, делящихся на 3");

        System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - timeStart) + " мс.");
    }
}
