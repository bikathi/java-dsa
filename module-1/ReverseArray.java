// write an algorithm to reverse an array
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get length of array from user
        int n = sc.nextInt();
        int[] arr = new int[n];

        // get values to fill array with
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // main logic
        // we traverse the array with two pointers
        // one pointer is the first index and the other pointer is the last index
        // we swap the elements at the indexes then increment the first pointer and decrement the last pointer - multiple swapping

        // we stop when i becomes greater than j
        int i = 0; // pointer at first index
        int j = n - 1; // pointer at last index
        while(i < j){
            int temp = arr[i]; // we store it so we don't lose it when we swap on line 27 below
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // finally print the array
        for(int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

}
