package weekone.daythree;

public class PracticeTwo {
    static void main() {
        int x = 12;
        int y = 17;
        int z = 1;
        for (; z < 4; z++) { // 1
            y = 19;
            while (x < 2 * y / z) { // y = 38
                x = x + z; // 13
                System.out.println("x = " + x + " y = " + y + " z = " + z);
            }
            x = x - 2 * y; // -
            System.out.println("x = " + x);
        }
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
}
