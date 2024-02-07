package org.example.kyu6;

public class MatrixAddition {
    public int[][] matrixAddition(int[][] a, int[][]b) {
        int arrLength = a.length;
        int[][] res = new int[arrLength][arrLength];

        for(int i = 0; i < arrLength; i++){
            for(int j = 0; j < arrLength; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
}
