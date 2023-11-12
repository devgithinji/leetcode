package org.densoft;

import java.util.Arrays;

public class MoveZeros {


    public static void main(String[] args) {
        int[] nos = {3, 0, 9, 0, 7, 8, 0};
        // Initialize an nonZeroIndex to track non-zero elements' positions
        int nonZeroIndex = 0;
        // Iterate through the array
        for (int i = 0; i < nos.length; i++) {
            // If the element is non-zero
            if (nos[i] != 0) {
                // Place it at the current nonZeroIndex
                nos[nonZeroIndex] = nos[i];
                if (i != nonZeroIndex) {
                    // If i and nonZeroIndex are different, replace the current i with zero
                }
                nos[i] = 0;
            }
            // Move to the next nonZeroIndex position
            nonZeroIndex++;
        }
        System.out.println(Arrays.toString(nos));

    }

}