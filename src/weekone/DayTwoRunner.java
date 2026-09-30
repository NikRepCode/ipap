package weekone;
//Упражнение 1:
//Спросить пользователя, сколько стоит чашка кофе
//
//Если  больше 300, то вывести "Дороговато"
//Если от 150 до 300, то вывести "Норм"
//Если от 80 до 150, то "Дешево"
//Если меньше 80, то вывести "А это в рублях? А это вообще кофе?"

public class DayTwoRunner {
    static void main() {
        double cost = Double.parseDouble(IO.readln("Сколько стоит кофе? Введите число: "));
        double maxCost = 300;
        double midCost = 150;
        double minCost = 80;
        String mes;

        if (cost > maxCost) {
            mes = "Дороговато";
        } else if (cost >= midCost) {
            mes = "Норм";
        } else if (cost >= minCost) {
            mes = "Дешево";
        } else {
            mes = "А это в рублях? А это вообще кофе?";
        }

        System.out.println(mes);
    }
}
