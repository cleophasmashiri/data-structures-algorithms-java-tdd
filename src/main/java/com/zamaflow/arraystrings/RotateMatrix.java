package com.zamaflow.arraystrings;

public class RotateMatrix {

    public int[][] rotate(int[][] m) {
        int len = m.length;
        int[][] a = new int[len][len];
        for (int x = 0; x < len; x++) {
            for (int y = 0; y < len; y++) {
                if (x != y)
                    a[x][y] = m[y][x];
                else 
                a[x][y] = m[x][y];
            }
        }
        return a;
    }

}
