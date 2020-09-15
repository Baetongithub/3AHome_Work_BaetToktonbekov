package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int i, j, clue, temp;
        int []numbs = {6, 2, 4, 5, 7, 1, 8};
        for (i = 0; i < numbs.length; i++) {
            clue = numbs[i];
            j = i - 1;
            while (j >= 0 && clue < numbs[j]) {
                temp = numbs[j];
                numbs[j] = numbs[j + 1];
                numbs[j + 1] = temp;
                j--;
            }
            System.out.println(Arrays.toString(numbs));
        }
    }
}
