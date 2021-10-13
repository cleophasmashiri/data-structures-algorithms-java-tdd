package com.zamaflow.arraystrings;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel
 * in the image is 4 bytes, write a method to rotate the image by 90 degrees.
 * Can you do this in place?
 **/

public class RotateMatrixTests {

    private RotateMatrix rotateMatrix;

    @Before
    public void setup() {
        rotateMatrix = new RotateMatrix();
    }

    private void print(int[][] m) {
        System.out.println("Printin matrix:");
        int n = m.length;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
               System.out.println("matrix(x: " + x + ", y: " + y + ") = " + m[x][y]);
            }
        }
    }

    @Test
    public void givenMatrixNxNShouldRotateItBy90Degrees() {
        int n = 2;
        int[][] m = new int[n][n];
        int c = 0;
        // initialise m
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                m[x][y] = c++;
            }
        }
        print(m);
        m = rotateMatrix.rotate(m);
        print(m);

        assertEquals(m[1][0], 1);
        assertEquals(m[0][1], 2);

    }

}
