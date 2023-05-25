import java.util.ArrayList;
import java.util.Arrays;

public class ZeroBasedPerm {
    public static void ZeroBasedPer(String[] args) {
//        Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
//Explanation: The array ans is built as follows:
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3]
        int j = 0;
        int[] arr = {1,3,5,2,4};
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

}
