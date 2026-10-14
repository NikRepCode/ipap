package weekthree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Создать список Точек
//упорядочить по расстояниSortю до Точки(0, 0)
//
//Создать список Отрезков (каждый отрезок включает 2 точки)
//Упорядочить отрезки по длине
//Найти среднюю, медианную и модную длины отрезков в списке
public class SortOfPointsSegmentsRunner {
    static void main() {
        List<Point> pointList = new ArrayList<>(List.of(new Point(1, 1),
                new Point(2, 2),
                new Point(5, 5),
                new Point(15, 15),
                new Point(20, 20),
                new Point(42, 42)));

        ICalculateDistance method = new EuclidCalculateDistance();

        sortOfListFromZero(pointList, method);
        List<Section> sectionList = getSections(pointList);
        System.out.println();
        sortOfListByLengthSection(sectionList, method);


    }

    public static void sortOfListFromZero(List<Point> pointList,
                                          ICalculateDistance method) {
        Point startOfAxis = new Point(0, 0);
        pointList.sort(Comparator.comparingDouble(
                point -> method.distance(point, startOfAxis)));

        System.out.println("Сортировка по расстоянию от (0,0): ");

        for (Point point : pointList) {
            System.out.println(point + ", distance: " + method.distance(point, startOfAxis));
        }
    }

    public static List<Section> getSections(List<Point> pointList) {
        List<Section> sections = new ArrayList<>();

        for (int i = 0; i < pointList.size(); i++) {
            for (int j = i + 1; j < pointList.size(); j++) {
                sections.add(new Section(pointList.get(i), pointList.get(j)));
            }
        }

        return sections;
    }

    public static void sortOfListByLengthSection(List<Section> sectionList,
                                                 ICalculateDistance method) {
        sectionList.sort(Comparator.comparingDouble(
                section -> section.lengthSection(method)));

        System.out.println("Сортировка отрезков по длине: ");

        for (Section section : sectionList) {
            System.out.println(section + ", distance: " + section.lengthSection(method));
        }
    }

    public static double getStatisticMean(List<Section> sectionList,
                                          ICalculateDistance method) {
        if (sectionList.isEmpty()) {
            throw new IllegalArgumentException("Список отрезков пуст");
        }

        double sum = 0;
        for (Section section : sectionList) {
            sum = sum + section.lengthSection(method);
        }

        double mean = sum / sectionList.size();
        return mean;
    }

//    public static double getStatisticMedian(List<Section> sectionList,
//                                            ICalculateDistance method) {
//        if (sectionList.isEmpty()) {
//            throw new IllegalArgumentException("Список отрезков пуст");
//        }
//
//        List<Double> lengthsOfSection = new ArrayList<>();
//        for (Section section : sectionList) {
//            lengthsOfSection.add(section.lengthSection(method));
//        }
//
//        lengthsOfSection.sort((a, b) -> Double.compare(a, b));
//
//
//        double median = ;
//        return median;
//    }

//    public static double getStatisticMode(List<Section> sectionList,
//                                          ICalculateDistance method) {
//
//        return;
//    }
}
