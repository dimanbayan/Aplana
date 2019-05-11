import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyTest {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число:");
        int number = Integer.parseInt(r.readLine());
        if (number==1) System.out.println("Вы ввели число 1");
    }
}
