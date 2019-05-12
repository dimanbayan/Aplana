package part2;

/*
Задание №9: Ввод/вывод данных для массива
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class massiv1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        System.out.println("Заполните массив десятью числами:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(r.readLine());
        }

        for (int x :
                array) {
            System.out.println(x * 2);
        }
    }
}
