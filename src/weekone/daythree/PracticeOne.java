package weekone.daythree;

public class PracticeOne {
    static void main() {
        int x = 12;
        double y = x / 5;       //  2.0 так как не делаем cast
        int z = x - 4;          // 8
        int i = 0;
        while (z < 10) {
            i = z / 2;          // 4
            while (i >= y) {        //  y = 2 3.5
                System.out.println("i равно " + i); // 4  4
                i = i - 1;              // 3 3
                System.out.println("i= " + i);
                y = y + 1.5;            // 3.5 5.0
                System.out.println("y= " + y);
            }
        }
        // бесконечный цикл
    }
}
