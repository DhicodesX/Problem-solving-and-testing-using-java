import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Task10 {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

    int m = matrix.size();
    int n = matrix.get(0).size();

    int layers = Math.min(m, n) / 2;

    for (int layer = 0; layer < layers; layer++) {

        List<Integer> list = new ArrayList<>();

        int top = layer;
        int left = layer;
        int bottom = m - 1 - layer;
        int right = n - 1 - layer;


        // Extract elements

        // Top row
        for (int j = left; j <= right; j++)
            list.add(matrix.get(top).get(j));

        // Right column
        for (int i = top + 1; i <= bottom; i++)
            list.add(matrix.get(i).get(right));

        // Bottom row
        for (int j = right - 1; j >= left; j--)
            list.add(matrix.get(bottom).get(j));

        // Left column
        for (int i = bottom - 1; i > top; i--)
            list.add(matrix.get(i).get(left));


        //  Rotate
        int len = list.size();
        int rot = r % len;

        Collections.rotate(list, -rot); // anti-clockwise


        //  Put back

        int idx = 0;

        // Top row
        for (int j = left; j <= right; j++)
            matrix.get(top).set(j, list.get(idx++));

        // Right column
        for (int i = top + 1; i <= bottom; i++)
            matrix.get(i).set(right, list.get(idx++));

        // Bottom row
        for (int j = right - 1; j >= left; j--)
            matrix.get(bottom).set(j, list.get(idx++));

        // Left column
        for (int i = bottom - 1; i > top; i--)
            matrix.get(i).set(left, list.get(idx++));
    }


    //  Print result
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix.get(i).get(j) + " ");
        }
        System.out.println();
    }
}


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] matrixRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> matrixRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int matrixItem = Integer.parseInt(matrixRowTempItems[j]);
                matrixRowItems.add(matrixItem);
            }

            matrix.add(matrixRowItems);
        }

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
