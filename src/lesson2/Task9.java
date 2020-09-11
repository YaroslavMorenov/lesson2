package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task9 {
    public static void main( String[] args ) {
        int[] arrayOfInt = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int size = arrayOfInt.length;
        for (int i = 0; i < size / 2; i++) {
            int j = arrayOfInt[i];
            arrayOfInt[i] = arrayOfInt[size - 1 - i];
            arrayOfInt[size - 1 - i] = j;
        }
        System.out.println(Arrays.toString(arrayOfInt));
    }
}








