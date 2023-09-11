import java.util.*;

public class SubArraysOfArray {
    public static void main(String[] args) {
        // a sub array is a contigout part of an array
        // we will need two pointers. One at the start index and the other at the end index
        // we get all sub arrays between the start index and end index
        // when we are done we increment the start index and repeat until we are done
        // the number of start indexes possible is equal the total number of sub arrays for a certain array
        // the last start index and end index is always equal to the last index of the given array
        // the end index is always equel to the current start index
        //

        Scanner sc = new Scanner(System.in);

        // get length of array from user
        int n = sc.nextInt();
        int[] arr = new int[n];

        // get values to fill array with
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // s1: create the two pointers for start index and end index that have an initial value of 0(start at 0 and end at 0)
        // int si;
        // int ei;

        for(int si = 0; si < n; si++) {
            for(int ei = si; ei < n; ei++) {
                // print the subarray between the start index and end index
                for(int k = si; k <= ei; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}
