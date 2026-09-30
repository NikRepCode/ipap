package weekone;

//Петя, Катя и Сережа делают из бумаги журавликов.
// Вместе они сделали S журавликов.
// Сколько журавликов сделал каждый ребенок, если известно,
// что Петя и Сережа сделали одинаковое количество журавликов,
// а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?

public class PracticeThreeRunner {
    public static void main(String[] args) {
        // при 6
        int numberPete; // 1
        int numberJorge; // 1
        int numberKate; // 4
        int totalBirds = Integer.parseInt(IO.readln("Введите четное кол-во птиц: "));


        //  p + s + k = total
        //  p + s + 2(p + s) = total
        //  p + s = total / 3

        //  p = (total / 3) / 2
        //  s = p
        if (totalBirds % 6 == 0) {  // Петя : Серёжа : Катя = 1 : 1 : 4 - должно делиться на 6
            int sumTwoChildren = totalBirds / 3;
            numberKate = sumTwoChildren * 2;
            numberJorge = sumTwoChildren / 2;
            numberPete = numberJorge;

            System.out.println("Pete made: " + numberPete);
            System.out.println("Jorge made: " + numberJorge);
            System.out.println("Kate made: " + numberKate);
        } else {
            System.out.println("Ввели нечетное число");
        }
    }
}
