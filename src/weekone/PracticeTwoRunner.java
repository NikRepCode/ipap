package weekone;

import java.util.Random;
// Бандиты Гарри и Ларри отдыхали на природе.
// Решив пострелять, они выставили на бревно несколько банок из-под кока-колы (не больше 10).
// Гарри начал простреливать банки по порядку, начиная с самой левой, Ларри — с самой правой.
// В какой-то момент получилось так, что они одновременно прострелили одну и ту же последнюю банку.
//
//Гарри возмутился и сказал, что Ларри должен ему кучу денег за то,
// что тот лишил его удовольствия прострелить несколько банок.
// В ответ Ларри сказал, что Гарри должен ему еще больше денег по тем же причинам.
// Они стали спорить кто кому сколько должен, но никто из них не помнил сколько банок было в начале,
// а искать простреленные банки по всей округе было неохота.
// Каждый из них помнил только, сколько банок прострелил он сам.
//
//Определите по этим данным, сколько банок не прострелил Гарри и сколько банок не прострелил Ларри.

public class PracticeTwoRunner {
    public static void main(String[] args) {
//        Random rnd = new Random();
//        int countJar = rnd.nextInt(11);
        int countJar = 10;

        System.out.println("Count of jar: " + countJar);

        int endGarry = Integer.parseInt(IO.readln("Enter number for Garry: ")); //4
        int endLarry = Integer.parseInt(IO.readln("Enter number for Larry: ")); //7

        int total = endGarry + endLarry - 1;
        int freeJarGarry = 0;
        int freeJarLarry = 0;

        if (total <= 10) {
            freeJarGarry = countJar - endGarry;
            freeJarLarry = countJar - endLarry;
        } else {
            System.out.println("WARNING: out of countJar");
        }

        System.out.println("Free jar for Garry: " + freeJarGarry); // 6
        System.out.println("Free jar for Larry: " + freeJarLarry);  //3
    }
}
