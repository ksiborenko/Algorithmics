public class Main {
    public static void main(String[] args) {


        int[] array = ArrayController.arrayFilling(100, 100);
        Algorithm.bubbleSort(array);
        Algorithm.binarySearchRecursive(23, array, 0, 100);

    }
}
