
import java.util.Arrays;

public class oddBeforeEven {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 7, 9, -2, 3 };
        int[] temp = new int[nums.length];
        int j = 0;
        int k = nums.length - 1;

        for (int i=0; i< nums.length; i++) {
            if (nums[i] % 2 == 1) {
                temp[j++] = nums[i];
            } else {
                temp[k--] = nums[i];
            }
        }

        copyArray(temp, nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void copyArray(int[] temp, int[] nums) {
        for (int x=0; x <nums.length; x++) {
            nums[x] = temp[x];
        }
    }


}
