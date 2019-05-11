package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите три числа \nX: ");
        int x = Integer.parseInt(r.readLine());
        System.out.print("Y: ");
        int y = Integer.parseInt(r.readLine());
        System.out.print("Z: ");
        int z = Integer.parseInt(r.readLine());

        double average = (double)(x+y+z)/3;
        System.out.println("Среднеке арифметическое чисел X,Y,Z = " + average);

        int div = (int) average / 2;
        //System.out.println("Деление среднего арифметического на 2 без остатка = " + div);

        if (div > 3)
            System.out.println("Программа выполнена корректно");
    }

}
