package lesson2;

import java.util.Arrays;

public class Task10 {
    public static void main( String[] args ) {
        int[] arrayOfInt = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int zeroIndex = arrayOfInt.length - 1;
        while (zeroIndex > 0 && arrayOfInt[zeroIndex] == 0) {
            zeroIndex--;
        }
        for (int i = 0; i < zeroIndex; i++) {
            if (arrayOfInt[i] == 0) {
                int temp = arrayOfInt[i];
                arrayOfInt[i] = arrayOfInt[zeroIndex];
                arrayOfInt[zeroIndex] = temp;
                zeroIndex--;
                while (zeroIndex > 0 && arrayOfInt[zeroIndex] == 0) {
                    zeroIndex--;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfInt));
    }
}





