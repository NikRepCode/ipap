package weekone;

//В рождественский вечер на окошке стояло три цветочка,
// слева направо: герань, крокус и фиалка.
// Каждое утро Маша вытирала окошко и меняла местами стоящий справа цветок с центральным цветком.
// А Таня каждый вечер поливала цветочки и меняла местами левый и центральный цветок.
// Требуется определить порядок цветов ночью по прошествии K дней.
//
//Входные данные
//Во входном файле INPUT.TXT содержится натуральное число K – число дней (K ≤ 1000).
//
//Выходные данные
//В выходной файл OUTPUT.TXT требуется вывести три английских буквы: «G», «C» и «V» (заглавные буквы без пробелов),
// описывающие порядок цветов на окошке по истечении K дней (слева направо).
// Обозначения: G – герань, C – крокус, V – фиалка.

import java.util.Arrays;

public class DayTwoPracticeOneRunner {
    static void main() {

        String[] str = {"G", "C", "V"};

//        String left = "G";
//        String center = "C";
//        String right = "V";

        System.out.println(Arrays.toString(str));

        int numbersNight = 5;
        for (int i = 0; i < numbersNight; i++) {
            String changePos; // taburet можно назвать, а женщины цветы на него ставят

            changePos = str[1];
            str[1] = str[2];
            str[2] = changePos;

            changePos = str[0];
            str[0] = str[1];
            str[1] = changePos;
        }
        System.out.println(Arrays.toString(str));

    }
}
