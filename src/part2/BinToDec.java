package part2;

/*
Задача №5: Таблица умножения
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinToDec {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число в двоичной системе счисления:");
        String binary = r.readLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Число в десятичной системе счисления имеет значение: \n" + decimal);
    }
}
