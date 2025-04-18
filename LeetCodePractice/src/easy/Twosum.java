public class Twosum {

    // Input: sorted array, return indices of values that sum to target
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 6}; // Already sorted
            int target = 6;

            int[] result = twoSumSorted(nums, target);
           // if (result.length == 2) {
                System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
                System.out.println("Indices: " + result[0] + ", " + result[1]);
           // } else {
                System.out.println("No valid pair found.");
            //}
        }

        public static int[] twoSumSorted(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    return new int[]{left, right};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            return new int[]{};
        }
    }


