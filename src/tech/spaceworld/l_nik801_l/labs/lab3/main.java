package tech.spaceworld.l_nik801_l.labs.lab3;

import java.util.Scanner;

public class main {
    public main() {
        Scanner in = new Scanner(System.in);
        String[] arr;
        StringBuilder result = new StringBuilder();

        System.out.println("Привет! я лаба 3!");
        System.out.println(
                "Вариант 10.\n" +
                        "   Напечатать:\n" +
                        "       Группы символов, состоящие только из латинских букв,\n" +
                        "       если последняя буква группы входит в нее еще только один раз."
        );
        System.out.println("Введите строку для последующей обработки:");
        arr = in.nextLine().split(" ");

        System.out.println("Выполнение программы...");
        long startTime = System.currentTimeMillis();

        for (String s : arr) {
            int flag = 0;
            char lastChar = s.toCharArray()[s.toCharArray().length - 1];
            for (char c : s.toCharArray()) {
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')))
                    break;
                if (c == lastChar) {
                    flag++;
                    if (flag > 1)
                        break;
                }
            }
            if (flag == 1)
                result.append(s).append(" ");
        }
        System.out.println(result);
        System.out.println("Программа выполнена за " + (System.currentTimeMillis() - startTime) + " мс.");
    }
}
