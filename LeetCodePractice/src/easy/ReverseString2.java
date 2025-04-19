/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
 If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
*/

public class ReverseString2 {
    public static void main(String[] args){
       String s= "abcd";
        int k =2;
        String reversed = reverseString1(s,k);
        //bacd
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString1(String s,int k) {


        char[] ch=s.toCharArray();
        for(int i =0;i<ch.length; i+=2*k){
            int start=i;
            int end=Math.min(i+k-1,ch.length-1);
            reverseStr(ch,start,end);
        }
        return new String(ch);

    }

    private static void reverseStr(char[] ch, int left, int right) {

        while(left<right){
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;

        }
    }


}
