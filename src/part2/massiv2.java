package part2;

/*
Задание №10: Ввод/вывод данных для матрицы
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class massiv2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[3][3];

        System.out.println("Заполните двумерный массив девятью числами:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(r.readLine());
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(array[0][i] * 3 + "\t");
        }
    }
}
