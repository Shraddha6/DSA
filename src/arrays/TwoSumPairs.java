package arrays;

public class TwoSumPairs {

    public static int[] twoSum(int[] nums, int target) {
        // TODO
        int sum = 0;
        int[] resultArray;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Element Found");
    }

    public static void main(String[] args) {
        int A[] = {3,5,6,4,1};
        int[] result = twoSum(A,20);
        for(int i : result){
            System.out.println(i);
        }

    }
}
