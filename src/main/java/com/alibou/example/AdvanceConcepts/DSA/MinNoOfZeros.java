package com.alibou.example.AdvanceConcepts.DSA;

public class MinNoOfZeros {
    //Given a 2D matrix containing only zeroes and ones, where each row is sorted. The task is to find the row with the maximum number of 0s
    //Input: mat[][] = {
    //{0, 1, 1, 1},
    //{0, 0, 1, 1},
    //{1, 1, 1, 1},
    //{0, 0, 0, 0}}
    //Output:
    //4

    public static int findRowOfMaxZeros(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int[] zeroCount = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    zeroCount[i]++;
                }

            }
            // [1  2  0  4]
        }
        int maxZeroCount = -1;
        int rowIndex = -1;
        for(int i =0;i< zeroCount.length;i++){
            if (zeroCount[i] > maxZeroCount) {
                maxZeroCount = zeroCount[i];
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}
