// write an algorithm to find the maximum element in an array
import java.util.*;

class HelloWorld {
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
        // s1: initiate the minimum possible value which acts as our basic max value
        int max = Integer.MIN_VALUE;

        // s2: traverse the array comparing the current value to our max value. if the current value is greater than our current max value, then set the new max value to the current value and repeat until the array is over, else just move to the next value until the array is over
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                // update your max value
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
