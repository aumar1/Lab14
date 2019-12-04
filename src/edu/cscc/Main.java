package edu.cscc;

//Adil Umar, 12/3/19, Compare sorting methods

//1. For a list of 100 surnames, how many milliseconds did a Bubble Sort take? - 16 milliseconds
//2. For a list of 100 surnames, how many milliseconds did a Java’s Sort take? - 0 milliseconds
//3. For a list of 25,000 surnames, how many milliseconds did a Bubble Sort take? - 24281 milliseconds
//4. For a list of 25,000 surnames, how many milliseconds did a Java’s Sort take? - 41 milliseconds
//5. Which algorithm is more efficient? - Java Sort

import java.io.IOException;
import java.util.Arrays;

public class Main {

    // TODO - once your code is working and tested, switch to the file bigsurnames.ser
    private static final String SERFNAME = "bigsurnames.ser";

    public static void main(String[] args) {

        String[] surnames;

        try {
            surnames = CensusData.deserialize(SERFNAME);
            System.out.println("Unsorted array of "+surnames.length+" names");
            top5names(surnames);
            System.out.println("=========================");

            System.out.println("Sort array with Bubble Sort");
            long start = System.currentTimeMillis();
            //Bubble Sort's sort method to sort the array
            BubbleSort.sort(surnames);
            long stop = System.currentTimeMillis();
            System.out.println("Elapsed time: "+(stop-start)+" milliseconds");
            top5names(surnames);
            System.out.println("=========================");

            surnames = CensusData.deserialize(SERFNAME);
            System.out.println("Sort array with Java built-in sort");
            start = System.currentTimeMillis();
            // TODO - Use Java's built-in sort method to sort the array
            Arrays.sort(surnames);
            stop = System.currentTimeMillis();
            System.out.println("Elapsed time: "+(stop-start)+" milliseconds");
            top5names(surnames);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Cannot read file "+SERFNAME);
        }
    }

    public static void top5names(String[] names) {
        System.out.println("Top 5 names in list");
        for (int i=0; i<5; ++i) {
            System.out.println(names[i]);
        }
    }
}
