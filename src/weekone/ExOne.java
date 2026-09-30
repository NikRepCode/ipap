package weekone;

import java.util.Scanner;

public class ExOne {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменной a: ");
        int a = scanner.nextInt();


        IO.println("Теперь вывод можно так делать");
        String sb = IO.readln("Введите значение переменной b: ");

        int b = Integer.parseInt(sb);

        int c = Integer.parseInt(IO.readln("Введите значение переменной c: "));
        double summ = a + b + c;
        System.out.println("Avg: " + summ / 3);
    }
}
