package home_tasks;

import java.util.Scanner;

public class Repl172_Array_Diagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;
        int d1 = 0, d2 = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += matrix[i][j];

                // finding sum of secondary diagonal
                if (i == matrix.length - j - 1)
                    d2 += matrix[i][j];
            }
        }

        result = (d1-d2);
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}


