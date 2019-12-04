package edu.cscc;

public class BubbleSort {
    public BubbleSort(String[] surnames) {
    }

    public static void sort(String[] list) {


        //Bubble Sort for a String array
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j <= list.length-2; j++) {
                if (list[j+1].compareTo(list[j]) < 0) {
                    //swap list[j] with list[j+1]
                    String temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                    changed = true;
                }
            }

        } while (changed);
    }
}