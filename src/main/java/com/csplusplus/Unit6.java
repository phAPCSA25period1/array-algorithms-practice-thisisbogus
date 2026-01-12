package com.csplusplus;

import java.util.Arrays;

public class Unit6 {

    // 1. Implement a method that takes an array of integers and returns the sum of all elements.
    // Instructions: Use a for-each loop to iterate through the array and calculate the sum.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int item : array)
        {
            sum += item;
        }
        return sum;  // Placeholder return value, replace with the correct sum.
    }

    // 2. Implement a method that finds the maximum element in an array of integers.
    // Instructions: Iterate through the array and track the largest number found.
    public static int maxElement(int[] array) {
        int maxNum = array[0];
        for (int item : array)
        {
            if (item > maxNum)
            {
                maxNum = item;
            }
        }
        return maxNum;  // Placeholder return value, replace with the correct maximum element.
    }

    // 3. Implement a method that takes an array and returns a new array with the elements in reverse order.
    // Instructions: Create a new array of the same size, and fill it with elements from the original array in reverse order.
    public static int[] reverseArray(int[] array) {
        int[] returnArray = array.clone();
        for (int i = 0; i < array.length; i++)
        {
            returnArray[array.length - 1  - i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(returnArray));
        System.out.println();
        return returnArray;  // Placeholder return value, replace with the reversed array.
    }     

    // 4. Implement a method that checks whether the given array is sorted in ascending order.
    // Instructions: Iterate through the array and check if each element is greater than or equal to the previous element.
    public static boolean isSorted(int[] array) {
        if (array.length == 0)
        {
            return true;
        }
        int lastNum = array[0];
        for (int item : array)
        {
            if (item < lastNum)
            {
                return false;
            }
            lastNum = item;
        }
        return true;  // Placeholder return value, replace with the correct boolean.
    }

    // 5. Implement a method that counts how many times a given number appears in the array.
    // Instructions: Use a for-each loop to iterate through the array and count the occurrences of the given number.
    public static int countOccurrences(int[] array, int number) {
        int numCount = 0;
        for (int item : array)
        {
            if (item == number)
            {
                numCount++;
            }
        }
        return numCount;  // Placeholder return value, replace with the correct count.
    }
}
