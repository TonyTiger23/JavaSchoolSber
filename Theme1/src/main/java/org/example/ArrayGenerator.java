package org.example;

import java.util.Random;

public class ArrayGenerator {
    public int[] generateArray(int size, int min, int max)
    {
        int[] array = new int[size];
        Random random = new Random();

        for (int i=0; i < size; i++)
        {
            array[i] = min + random.nextInt(max - min +1);
        }
        return array;
    }

}
