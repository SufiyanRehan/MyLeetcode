//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//Example 1:
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args){

        int[] nums= {3,2,3,4,3};
        System.out.println("Before majority:"+ Arrays.toString(nums));
        majorityElement(nums);
        majorityElementUsingVotingMethod(nums);

        System.out.println("Majority Element Using Sort method: " + majorityElement(nums));
        System.out.println("Majority Element Using VOte Algorithem: " + majorityElementUsingVotingMethod(nums));

    }

    private static int majorityElementUsingVotingMethod(int[] nums) {
        int majority=nums[0];
        int votes=1;
        for(int i =1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            } else if (majority==nums[i]) {
                votes++;
            }else {
                votes--;
            }
        }
    return majority;


    }

    //By using sorting
    private static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }



}
