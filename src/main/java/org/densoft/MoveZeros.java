package org.densoft;

import java.util.Arrays;

public class MoveZeros {


    public static void main(String[] args) {
        int[] nos = {3, 0, 9, 0, 7, 8, 0};

        int nonZeroIndex = 0;

        for (int i = 0; i < nos.length; i++) {
            if (nos[i] != 0) {
                nos[nonZeroIndex] = nos[i];
                if (i != nonZeroIndex) {

                    nos[i] = 0;
                }
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nos));
    }

}