package com.alibou.example.AdvanceConcepts.DSA;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int result = MinNoOfZeros.findRowOfMaxZeros(a);
        System.out.println("Row with maximum 0s is: " + result);
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
