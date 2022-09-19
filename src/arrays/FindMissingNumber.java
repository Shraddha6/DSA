package arrays;

public class FindMissingNumber {
    public static int missingNumber(int[] intArray) {
        // TODO
        int sum =0, arrayRangeSum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
       /* for (int i = 1; i <= 5; i++) {
            arrayRangeSum = arrayRangeSum + i;
        }*/

        /**
             n*(n+1)/2
         */
        arrayRangeSum = 10*(10+1)/2;
        return arrayRangeSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4,6,7,8,10};
       System.out.println(missingNumber(arr));
    }
}
