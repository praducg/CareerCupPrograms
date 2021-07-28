package com.learning.careercup.programs;

import java.util.Arrays;

public class RotateMatrixBy90Degrees {
    public static void main(String[] args) {
        int[][] matrixInp = new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}

        };
        int[][] printMatrix = printmatrix(matrixInp);
        for (int i = 0; i < printMatrix.length; i++) {
            for (int j = 0; j < printMatrix.length; j++) {
                System.out.print(printMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] rotatematrix = rotatedMatrix(printMatrix);
        for (int i = 0; i < rotatematrix.length; i++) {
            for (int j = 0; j < rotatematrix.length; j++) {
                System.out.print(rotatematrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] printmatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;

    }


    static int[][] rotatedMatrix(int[][] matrix) {
        int noOfColumns = matrix.length;
        int noOfRows = matrix[0].length;
        int[][] rotateMatrix = new int[noOfColumns][noOfRows];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                rotateMatrix[j][noOfColumns - 1 - i] = matrix[i][j];
            }
        }
        return matrix;
    }

}
