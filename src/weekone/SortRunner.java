package weekone;

public class SortRunner {
    static void main() {
        int[] arr = {3, 6, 1, 8, 2, 9, 4};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
        ass();
    }

    static void ass() {
    }

    public static void bubbleSort() {
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // Находим индекс опорного элемента после разбиения
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем левую и правую части
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Опорный элемент — последний (схема Ломуто)
        int pivot = arr[high];

        // i — граница "меньших чем pivot"
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Ставим pivot на его финальное место
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
