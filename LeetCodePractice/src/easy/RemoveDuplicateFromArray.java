import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int[] nums= {0,1,0,3,12,12};
        System.out.println(""+removeDuplicatce(nums));
    }

    private static boolean removeDuplicatce(int[] nums) {
        Set<Integer> intSet= new HashSet<>();

        for(int i :nums){
            if (intSet.contains(nums))
                return true;
                intSet.add(i);

        }
        return false;

    }
}
