package com.epam.mjc.stage0;


public class ArrayTasks {


    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }


    public int[] generateNumbers(int length) {
        int [] consecutiveIntegers = new int[length];
        int counter = 1;
        for (int i = 0; i < length; i++) {
            consecutiveIntegers[i] = counter;
            counter++;
        }
        return consecutiveIntegers;
    }


    public int totalSum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }


    public int findIndexOfNumber(int[] arr, int number) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result = i;
                break;
            } else if (arr[i] != number) {
                result = -1;
            }
        }
        return result;
    }


    public String[] reverseArray(String[] arr) {
        String [] reverse = new String[arr.length];
        int counter = 0;
        for (int k = reverse.length - 1; k >= 0; k--) {
            reverse[k] = arr[counter];
            counter++;
        }
        return reverse;
    }


    public int[] getOnlyPositiveNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        int [] positiveArray = new int[counter];
        counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveArray[counter] = arr[i];
                counter++;
            }
        }
        return positiveArray;
    }



    public int[][] sortRaggedArray(int[][] arr) {
        for (int[] i : arr) {
            bubbleSort(i);
        }
        bubbleSort2dArray(arr);
        return arr;
    }

    public void bubbleSort2dArray(int[][] array) {
        boolean swapped = true;
        int j = 0;
        int[] tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i].length > array[i + 1].length) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }


    public int[] bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return array;
    }
}
