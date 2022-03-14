package workshop1;

import java.lang.System;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        int rows, cols, matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so rows: ");
        rows = sc.nextInt();
        System.out.println("Nhap so cols: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Nhap the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nA[" + i + "][" + j + "]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputted: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum +=matrix[i][j];
            }
        }
        System.out.println("Sum:" + sum);
        System.out.println("Average:" +(float)sum/(rows*cols));
    }
}
