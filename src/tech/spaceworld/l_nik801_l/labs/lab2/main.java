package tech.spaceworld.l_nik801_l.labs.lab2;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public main() throws Exception {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, int[]> vars = new HashMap<>();
        Double radius;

        System.out.println("Привет! я лаба 2!");
        System.out.println(
                "Вариант 10." +
                "   Произвольный треугольник задан декартовыми координатами своих вершин (X1,Y1),(X2,Y2),(X3,Y3) – целыми числами.\n" +
                "   Определить, может ли он поместиться внутри окружности радиуса R(вещественное число)."
        );
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите координаты точки в формате: \"X" + i + ", Y" + i + "\"");
            int[] temp = new int[2];
            int index = 0;
            for (String s : in.nextLine().split(", ")) {
                try {
                    temp[index] = Integer.parseInt(s);
                    index++;
                } catch (Exception e) {
                    System.out.println("Введены неверные данные. Ошибка: ");
                    throw new Exception(e);
                }
            }
            vars.put(i, temp);
        }
        System.out.println("Введите радиус окружности: ");
        radius = Double.parseDouble(in.nextLine());


        System.out.println("Выполнение программы...");
        long startTime = System.currentTimeMillis();

        double a = Math.sqrt(Math.pow((vars.get(1)[0] + vars.get(2)[0]), 2) + Math.pow((vars.get(1)[1] + vars.get(2)[1]), 2));
        double b = Math.sqrt(Math.pow((vars.get(3)[0] + vars.get(2)[0]), 2) + Math.pow((vars.get(3)[1] + vars.get(2)[1]), 2));
        double c = Math.sqrt(Math.pow((vars.get(1)[0] + vars.get(3)[0]), 2) + Math.pow((vars.get(1)[1] + vars.get(3)[1]), 2));

        if (radius == radius(a, b, c)) {
            System.out.println("Да, может");
        } else {
            System.out.println("Нет, не может");
            System.out.println(radius + " " + radius(a, b, c));
        }

        System.out.println("Программа выполнена за " + (System.currentTimeMillis() - startTime) + " мс.");
    }
    double radius(double a, double b, double c) {
        double p = ((a + b + c) / 2);
        return ((a * b * c) / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }
}
