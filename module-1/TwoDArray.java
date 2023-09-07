// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // initialize 2D array
        int[][] arr = new int[5][6];

        // set a value
        arr[1][3] = 10; // first row third column
        System.out.println(arr[1][3]);

        // get a value
        int value = arr[1][3];
        System.out.println(value);
        System.out.println(arr[2][5]);

        // count number of rows
        System.out.println(arr.length);

        // count number of columns - length of row 0 or any column
        System.out.println(arr[2].length);

        // traverse(loop) 2D array travel each row
        // outer loop travels the row, inner loop travels the column
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                // do processing here e.g print 2D array
                System.out.println(arr[i][j]);
            }
        }


    }
}
