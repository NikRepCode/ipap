package weektwo;

//Компания из N человек собирается пойти в байдарочный поход,
// i-ый человек характеризуется своей массой Mi кг.
// На лодочной базе имеется в наличии неограниченное количество одинаковых байдарок.
// Каждая байдарка может вмещать одного или двух людей.
// Байдарки имеют грузоподъемность D кг.
// Какое наименьшее количество байдарок придется арендовать компании, чтобы всем отправиться в поход?
//
//Входные данные
//В первой строке входного файла INPUT.TXT содержится пара натуральных чисел
// N, D (1 ≤ N ≤ 15000; 1 ≤ D ≤ 15000).
// Во второй строке содержится последовательность натуральных чисел M1, M2, ... , MN (1 ≤ Mi ≤ D).
//
//Выходные данные
//В выходной файл OUTPUT.TXT выведите искомое наименьшее количество необходимых байдарок.

//  кол-во человек - 4 135  - грузоподъемность                             2 - наименьшее число байдарок
//  масса           50 74 60 82
//
//        6 135                               4
//        50 120 74 60 100 82

public class CanoeCruiseRunner {
    static void main() {
        int tonnageOfCanoe = Integer.parseInt(IO.readln("Введите грузоподъемность байдарки: "));
        int[] weightOfPeople = getDataForArray();
        bubbleSort(weightOfPeople);
        int countOfCanoes = getCountOfCanoes(weightOfPeople, tonnageOfCanoe);
        System.out.println("Байдарок нужно: " + countOfCanoes);
    }

    public static int[] getDataForArray() {
        int countOfPerson = Integer.parseInt(IO.readln("Введите кол-во человек: "));
        int[] weightOfPeople = new int[countOfPerson];
        System.out.println("Введите вес каждого человек: ");

        for (int i = 0; i < weightOfPeople.length; i++) {
            weightOfPeople[i] = Integer.parseInt(IO.readln());
        }

        return weightOfPeople;
    }

    public static void bubbleSort(int[] rawArray) {

        for (int i = 0; i < rawArray.length - 1; i++) {
            for (int j = 0; j < rawArray.length - i - 1; j++) {
                if (rawArray[j] > rawArray[j + 1]) {
                    int temp = rawArray[j];
                    rawArray[j] = rawArray[j + 1];
                    rawArray[j + 1] = temp;
                }
            }
        }
    }

    public static int getCountOfCanoes(int[] weightOfPeople, int tonnageOfCanoe) {
        int left = 0;
        int right = weightOfPeople.length - 1;
        int countOfCanoes = 0;

        while (left <= right) {
            if ((left < right) &&
                    ((weightOfPeople[left] + weightOfPeople[right]) <= tonnageOfCanoe)) {
                left++;
            }
            right--;
            countOfCanoes++;
        }

        return countOfCanoes;
    }
}
