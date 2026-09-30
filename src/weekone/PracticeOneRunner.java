package weekone;

// 1) создать проект, в котором изначально заданы значения 3 целочисленных переменных
//с названиями a, b, c
//вывести: сумму чисел, среднее арифметическое,
//разности a - b, b - a, a - c, c - a, b - c, c - b
public class PracticeOneRunner {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;
        double countNumbers = 3;

        int sum = a + b + c;
        double average = sum / countNumbers;
        int differenceOne = a - b;
        int differenceTwo = b - a;
        int differenceThree = a - c;
        int differenceFour = c - a;
        int differenceFive = b - c;
        int differenceSeven = c - b;

        System.out.println("Sum: " + sum);
        System.out.println("average: " + average);
        System.out.println("a - b: " + differenceOne);
        System.out.println("b - a: " + differenceTwo);
        System.out.println("a - c: " + differenceThree);
        System.out.println("c - a: " + differenceFour);
        System.out.println("b - c: " + differenceFive);
        System.out.println("c - b: " + differenceSeven);

    }
}
