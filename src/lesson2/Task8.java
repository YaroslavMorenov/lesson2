package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task8 {
    public static void main( String[] args ) {
        int[] arrayOfInt = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        System.out.println(maxArray(arrayOfInt));
        System.out.println(sumArray(arrayOfInt));
        System.out.println(sumEvenArray(arrayOfInt));
        System.out.println(countPositiveElementsInArray(arrayOfInt));
        System.out.println(averageArray(arrayOfInt));
    }

    public static int maxArray( int[] arrayOfInt ) {
        int maxArray = arrayOfInt[0];
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (maxArray < arrayOfInt[i]) {
                maxArray = arrayOfInt[i];
            }
        }
        return maxArray;
    }

    public static int sumArray( int[] arrayOfInt ) {
        int sumArray = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] > 0) {
                sumArray += arrayOfInt[i];
            }
        }
        return sumArray;
    }

    public static int sumEvenArray( int[] arrayOfInt ) {
        int sumEvenArray = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] < 0 && arrayOfInt[i] % 2 == 0) {
                sumEvenArray += arrayOfInt[i];
            }
        }
        return sumEvenArray;
    }

    public static int countPositiveElementsInArray( int[] arrayOfInt ) {
        int countPositiveElementsInArray = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] > 0) {
                countPositiveElementsInArray++;
            }
        }
        return countPositiveElementsInArray;
    }

    public static double averageArray( int[] arrayOfInt ) {
        double averageArray = 0;
        int countArray = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] < 0) {
                countArray++;
                averageArray += arrayOfInt[i];
            }
        }
        averageArray /= countArray;
        return averageArray;
    }
}

