package org.example;

public class ResultPrinter {
    public void printArray( int[] array, String message)
    {
        System.out.println(message);
        for(int num: array)
        {
            System.out.print(num +" ");
        }
        System.out.println();
    }

    public void printSearchResult(int target, int index){
        if (index != -1)
        {
            System.out.println("Element "+target + " found at index " + index);
        }
        else {
            System.out.println("Element " + target + " not found");
        }
    }
}
