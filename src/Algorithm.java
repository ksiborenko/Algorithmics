import java.util.ArrayList;

public class Algorithm {

    public static void binaryToDecimal(int[] array) {
        int base = 1;
        int sum = 0;
        for (int arrayIndex = array.length - 1; arrayIndex >= 0; arrayIndex--) {
            if (array[arrayIndex] == 1) {
                sum += base;
            }
            base *= 2;
        }
        System.out.println(sum);

    }

    public static void decimalToBinary(int num) {
        int factor = 1;
        int sum = 0;
        ArrayList<Integer> factors = new ArrayList<>();
        while (factor <= num) {
            factors.add(factor);
            factor *= 2;
        }
        for (int factorIndex = factors.size() - 1; factorIndex >= 0; factorIndex--) {
            if (sum + factors.get(factorIndex) <= num) {
                sum += factors.get(factorIndex);
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

    public static void octToDecimal(int[] array) {
        int sum = 0;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            int temp = (int) Math.pow(8, arrayIndex) * array[arrayIndex];
            sum += temp;
        }
        System.out.println(sum);

    }

    public static void binarySearch(int searchNum, int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (array[mid] == searchNum) {
                System.out.println("Searching number is on position: " + mid);
                break;
            }
            if (array[mid] > searchNum) {
                end = mid - 1;
            }
            if (array[mid] < searchNum) {
                start = mid + 1;
            }
            if (start > end) {
                System.out.print("Not found");
            }
        }
    }

    public static void findPrimes(int num) {
        int factor = 2;
        ArrayList<Integer> primes = new ArrayList<>();
        while (factor <= num) {
            if (num % factor == 0) {
                primes.add(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        System.out.print("Prime numbers: ");
        ArrayController.arrayListPrint(primes);
    }

    public static void bubbleSort(int[] array) {
        int swap = 0;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            for (int x = 0; x < array.length - 1; x++) {
                if (array[x] > array[x + 1]) {
                    swap = array[x + 1];
                    array[x + 1] = array[x];
                    array[x] = swap;
                }
            }
        }
        ArrayController.arrayPrint(array);
    }

    public static int factorialRecursive(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }

    }

    public static int fibonacciRecursive(int number) {
        if (number > 2) {
            return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
        } else {
            return 1;
        }
    }

    public static void binarySearchRecursive(int search, int[] array, int begin, int end) {
        if (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (search < array[mid]) {
                binarySearchRecursive(search, array, begin, mid - 1);
            } else if (search > array[mid]) {
                binarySearchRecursive(search, array, mid + 1, end);
            } else if (search == array[mid]) {
                System.out.println("Found on position " + (mid + 1));
            }
        }
        if (begin > end) {
            System.out.println();
            System.out.println("Not found");
        }
    }

    public static void quickSort () {

    }
}


