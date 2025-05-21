// Write a Java program to add two matrices of same size.
package arrays;

import java.util.Scanner;

public class Question18 {
    static Scanner scanner = new Scanner(System.in);

    // Method in which all the other functions are called directly or indirectly.
    public static void calculateMatrixSum(){
        int rows, cols;
        System.out.print("Enter number of Rows of Matrix : ");
        rows = scanner.nextInt();
        System.out.print("Enter number of Columns of Matrix : ");
        cols = scanner.nextInt();
        System.out.println();

        if(rows > 0 && cols > 0){
            sumOfMatrix(constructMatrix1(rows, cols), constructMatrix2(rows, cols), rows, cols);
        }else {
            System.out.println("Invalid input. Rows and Columns of Matrix must be greater then 0.");
        }
    }


    // General Method to construct a Matrix means 2-D array.
    private static void constructMatrix(int[][] matrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value of index["+i+"]["+j+"] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }


    // Method to display a Matrix.
    private static void displayMatrix(int[][] matrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    // Method to construct First Matrix and display it also.
    private static int[][] constructMatrix1(int rows, int cols){
        System.out.println("Enter the values for First Matrix.");
        int[][] firstMatrix = new int[rows][cols];
        constructMatrix(firstMatrix, rows, cols);

        System.out.println("The first Matrix is : ");
        displayMatrix(firstMatrix, rows, cols);

        return firstMatrix;
    }

    // Method to construct Second Matrix and display it also.
    private static int[][] constructMatrix2(int rows, int cols){
        System.out.println("Enter the values for Second Matrix.");
        int[][] secondMatrix = new int[rows][cols];
        constructMatrix(secondMatrix, rows, cols);

        System.out.println("The second Matrix is : ");
        displayMatrix(secondMatrix, rows, cols);

        return secondMatrix;
    }


    // Method to do the Sum of two matrices and display it also.
    private static void sumOfMatrix(int[][] matrix1, int[][] matrix2, int rows, int cols){
        int [][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The Sum of Matrices is : ");
        displayMatrix(sumMatrix, rows, cols);
    }
}

/*
Question18.calculateMatrixSum();
 */
