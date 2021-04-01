public class Main {
    public static void main(String[] args) {


        int[] array = ArrayController.arrayFilling(100, 1000);
        Algorithm.bubbleSort(array);
        Algorithm.binarySearchRecursive(23, array, 0, 100);
        System.out.println();
    }
}
