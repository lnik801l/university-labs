package tech.spaceworld.l_nik801_l;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите номер лабораторной работы, которую желаете запустить.\nВ данный момент доступны: \n 1   2   3   4   5");
        switch (in.nextLine()) {
            case ("1") :
                new tech.spaceworld.l_nik801_l.labs.lab1.main();
                break;
            case ("2") :
                new tech.spaceworld.l_nik801_l.labs.lab2.main();
                break;
            case ("3") :
                new tech.spaceworld.l_nik801_l.labs.lab3.main();
                break;
            case ("4") :
                new tech.spaceworld.l_nik801_l.labs.lab4.main();
                break;
            case ("5") :
                new tech.spaceworld.l_nik801_l.labs.lab5.main();
                break;
        }
    }
}
