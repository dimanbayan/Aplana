package part2;

/*
Задача №7: Условие вывода данных
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int X=48, Y=97, Z=1;

        System.out.println("Введите число T:");
        int T = Integer.parseInt(r.readLine());

        switch (T){
            case 48:
            case 97:
            case 1:
                System.out.println("Данное значение имеется в константах");
                break;
                default:
                    System.out.println("Такой константы нет!");
        }
    }
}
