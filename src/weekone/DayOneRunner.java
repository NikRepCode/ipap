package weekone;

    //  Найти максимум из трех чисел
public class DayOneRunner {

    public static void main(String[] args) {
        int valOne = 1;
        int valTwo = 2;
        int valThree = 3;
        int maxValue;

        if ((valOne >= valTwo) && (valOne >= valThree)) {
            maxValue = valOne;
        } else if (valTwo >= valThree) {
            maxValue = valTwo;
        } else {
            maxValue = valThree;
        }
        System.out.println("Max value = " + maxValue);
    }
}
