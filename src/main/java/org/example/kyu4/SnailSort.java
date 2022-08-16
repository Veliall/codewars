package org.example.kyu4;

import java.util.ArrayList;
import java.util.List;

public class SnailSort {
    public static int[] snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        var dir = "right";
        var imin = 0;
        var imax = array.length - 1;
        var jmin = 0;
        var jmax = array[0].length - 1;

        var i = imin;
        var j = jmin;
        var done = false;

        while (!done) {

            switch (dir) {
                case "right" -> {
                    i = imin;
                    j = jmin;
                    while (j <= jmax) {
                        result.add(array[i][j]);
                        j++;
                    }
                    dir = "down";
                    imin++;
                }
                case "left" -> {
                    i = imax;
                    j = jmax;
                    while (j >= jmin) {
                        result.add(array[i][j]);
                        j--;
                    }
                    dir = "up";
                    imax--;
                }
                case "down" -> {
                    i = imin;
                    j = jmax;
                    while (i <= imax) {
                        result.add(array[i][j]);
                        i++;
                    }
                    dir = "left";
                    jmax--;
                }
                case "up" -> {
                    i = imax;
                    j = jmin;
                    while (i >= imin) {
                        result.add(array[i][j]);
                        i--;
                    }
                    dir = "right";
                    jmin++;
                }
            }

            if (imin > imax || jmin > jmax)
                done = true;
        }
        return result.stream().mapToInt(integer -> integer).toArray();
    }
}
