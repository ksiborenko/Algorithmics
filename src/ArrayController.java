import java.util.ArrayList;
import java.util.Random;

public class ArrayController {

    public static int[] arrayFilling(int arraySize) {
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
            array[arrayIndex] = random.nextInt(1000) - 500;
        }
        return array;
    }

    public static void arrayPrint(int[] array) {
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            System.out.print(array[arrayIndex]);
            if (arrayIndex != array.length - 1) {
                System.out.print(", ");
            }
            if (arrayIndex % 20 == 0 && arrayIndex != 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void arrayListPrint(ArrayList<Integer> list) {
        for (int listIndex = 0; listIndex < list.size(); listIndex++) {
            System.out.print(list.get(listIndex));
            if (listIndex != list.size() - 1) {
                System.out.print(", ");
            }
        }
    }

}
