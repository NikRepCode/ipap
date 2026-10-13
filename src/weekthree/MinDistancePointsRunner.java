package weekthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Point{
//	int x, y;
//}
//
//Сделать интерфейс "вычисление расстояния"
//Реализации:
//	- по Евклиду
//	- по фон Нейману
//	- по Муру
//
//Сделать в Main список из 5 точек, которые введет пользователь
//
//Написать функцию нахождения кратчайшего расстояния по списку точек,
// которая сможет использовать любой из методов вычисления расстояния


public class MinDistancePointsRunner {

    static void main() {
        List<Point> pointList = getPoints(5);
        List<ICalculateDistance> methods = List.of(
                new EuclidCalculateDistance(),
                new NeumannCalculateDistance(),
                new MoorCalculateDistance()
        );

        for (int i = 0; i < methods.size(); i++) {
            ICalculateDistance metric = methods.get(i);
            double min = getMinDistance(pointList, metric);
            System.out.println("Метод: " + metric.name() + ", min: " + min);
        }

    }

    public static List<Point> getPoints(int numberPoints) {
        System.out.println("ВВедите координаты " + numberPoints + " точек(`x` и `y` через пробел): ");
        List<Point> pointList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numberPoints; i++) {
            int corrX = sc.nextInt();
            int corrY = sc.nextInt();
            pointList.add(new Point(corrX, corrY));

        }

        return pointList;
    }


    public static double getMinDistance(List<Point> pointList, ICalculateDistance calculateDistance) {

        if (pointList == null || pointList.size() < 2) {
            throw new IllegalArgumentException("Нужно минимум 2 точки");
        }

        double minDistance = Double.POSITIVE_INFINITY;

        for (int i = 0; i < pointList.size(); i++) {

            for (int j = i + 1; j < pointList.size(); j++) {
                double distance = calculateDistance.distance(pointList.get(i), pointList.get(j));

                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }
}

