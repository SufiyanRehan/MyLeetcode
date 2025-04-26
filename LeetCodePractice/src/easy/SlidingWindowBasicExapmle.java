//Given: An array of integers arr[] and an integer k
//Task: Find the maximum sum of any contiguous subarray of size k.

//Input: arr = [2, 1, 5, 1, 3, 2], k = 3
//Subarrays of size 3:
//        [2, 1, 5] → sum = 8
//        [1, 5, 1] → sum = 7
//        [5, 1, 3] → sum = 9 ← max
//        [1, 3, 2] → sum = 6
//
//Output: 9


public class SlidingWindowBasicExapmle {
    public static void main(String[] args) {
        int [] arr={2,1,5,1,3,2};
        int k =3;
        System.out.println("Max Sum of Subarray of size " + k + " is: " + maxSum(arr, k));

    }

    private static int maxSum(int[] arr, int k) {

        int maxSum=0;
        int current=0;

        //firstWindow
        for(int i=0;i<k;i++){
            current += arr[i];
        }

        maxSum=current;

        //slideWindow
        for(int i=k;i<arr.length;i++){
            current +=arr[i] - arr[i-k];
            maxSum=Math.max(maxSum,current);
        }
        return maxSum;


    }

}
