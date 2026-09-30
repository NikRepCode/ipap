package weekone;

// Упражнение 2
//Много раз Попросить пользователя вводить целые числа
//Остановиться, когда сумма введенных чисел достигнет 42
//
//Рассказать, сколько всего он ввел чисел
//
//+ Каков процент количества положительных чисел?
//+ Чему равна сумма отрицательных чисел?

// доделать
public class DayTwoPracticeTwoRunner {
    static void main() {

        number1();
        number2();
    }

    private static void number1() {
        int sum = 0;
        int countNum = 0;
        int sumNegativeNum = 0;
        int countNegativeNum = 0;
        int countPositiveNum = 0;
        double percentagePosNum = 0;

        while (true) {
            int num = Integer.parseInt(IO.readln("Введите целые числа "));

            countNum++;
            sum += num;
            System.out.println("Текущая сумма: " + sum);

            if (sum >= 42) {
                System.out.println("Достигнут лимит: " + sum);
                break;
            }

            if (num < 0) {
                countNegativeNum++;
                sumNegativeNum = sumNegativeNum + Math.abs(num);
            }

            percentagePosNum = countNegativeNum / countNum * 100;
        }

        System.out.println("В пределах лимита ввели чисел: " + countNum);
        System.out.println("% положительных чисел: " + countNum);
        System.out.println("Отрицательных ввели чисел: " + countNegativeNum);
    }

    private static void number2() {
        int countNum = 0;           // всего введено
        int countPosNum = 0;        // положительных
        int countNegNum = 0;        // отрицательных
        int sum = 0;                // общая сумма
        int sumNegNum = 0;          // сумма отрицательных

        while (true) {
            int num = Integer.parseInt(IO.readln("Введите целое число: "));

            countNum++;
            sum += num;

            if (num > 0) {
                countPosNum++;
            } else if (num < 0) {
                countNegNum++;
                sumNegNum += num;   // если нужна сумма "как есть" (со знаком минус)
            }

            System.out.println("Текущая сумма: " + sum);

            if (sum >= 42) {
                System.out.println("Достигнут лимит: " + sum);
                break;
            }
        }

        double percentPos = (double) countPosNum / countNum * 100;

        System.out.println("Всего введено чисел: " + countNum);
        System.out.println("% положительных чисел: " + percentPos);
        System.out.println("Отрицательных ввели: " + countNegNum);
        System.out.println("Сумма отрицательных: " + sumNegNum);
    }
}

