package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число:");
        int num = Integer.parseInt(r.readLine());

        System.out.println("Таблица умножения для числа " + num + ":");

        System.out.println( 1 + " * " + num + " = " + num + "\n" +
                            2 + " * " + num + " = " + 2*num + "\n" +
                            3 + " * " + num + " = " + 3*num + "\n" +
                            4 + " * " + num + " = " + 4*num + "\n" +
                            5 + " * " + num + " = " + 5*num + "\n" +
                            6 + " * " + num + " = " + 6*num + "\n" +
                            7 + " * " + num + " = " + 7*num + "\n" +
                            8 + " * " + num + " = " + 8*num + "\n" +
                            9 + " * " + num + " = " + 9*num + "\n" +
                            10 + " * " + num + " = " + 10*num);
    }
}
