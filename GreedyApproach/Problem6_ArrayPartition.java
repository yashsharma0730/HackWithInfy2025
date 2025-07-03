import java.util.Arrays;

public class Problem6_ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;

        for (int i = 0; i < nums.length; i += 2) {
            total += nums[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int result = arrayPairSum(nums);
        System.out.println("Max Sum of Min Pairs: " + result);
    }
}
