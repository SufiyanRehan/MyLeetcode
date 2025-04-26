public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0; // Pointer for placing non-val elements

        for (int j = 0; j < nums.length-1; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // New length of the array
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int newLength = removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
