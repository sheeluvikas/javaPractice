package coding.kadane;

public class LargestSumSubArray {

    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1};

        System.out.println(largestSum(arr));
    }

    public static int largestSum(int[] arr){
        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currSum = currSum + arr[i];
            if(arr[i] > currSum){
                currSum = arr[i];
            }
            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
